/*
 * Copyright 2014 - 2021 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package evtest.sample;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.integration.view.spring.EnableEntityViews;
import com.blazebit.persistence.spring.data.impl.repository.BlazePersistenceRepositoryFactoryBean;
import com.blazebit.persistence.view.EntityViewSetting;
import evtest.model.item.ItemTypeA;
import evtest.repository.ItemSimpleViewRepository;
import evtest.view.item.ItemTypeAView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SampleTest.TestConfig.class)
public class SampleTest extends AbstractSampleTest {

    @Autowired
    private ItemSimpleViewRepository itemSimpleViewRepository;

    @Test
    public void sampleTest() {
        EntityViewSetting<ItemTypeAView, CriteriaBuilder<ItemTypeAView>> settings =
                EntityViewSetting.create(ItemTypeAView.class);
        CriteriaBuilder<ItemTypeA> builder =
                criteriaBuilderFactory.create(this.em, ItemTypeA.class);
        builder.where("_refType.valueA").like(false).literal("%A%").noEscape();

        CriteriaBuilder<ItemTypeAView> viewBuilder = this.entityViewManager.applySetting(settings, builder);
        List<ItemTypeAView> items = viewBuilder.getResultList();
    }

    @Configuration
    @ComponentScan("evtest")
    @EnableEntityViews(basePackages = {"evtest.view"})
    @EnableJpaRepositories(
            basePackages = "evtest.repository",
            repositoryFactoryBeanClass = BlazePersistenceRepositoryFactoryBean.class)
    static class TestConfig {
    }
}
