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

import javax.persistence.EntityManager;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import evtest.model.Cat;
import evtest.model.Person;
import evtest.model.item.ItemTypeA;
import evtest.model.item.ItemTypeB;
import evtest.model.ref.RefTypeA;
import evtest.model.ref.RefTypeB;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractSampleTest {

    @Autowired
    protected EntityManager em;

    @Autowired
    CriteriaBuilderFactory criteriaBuilderFactory;

    @Autowired
    EntityViewManager entityViewManager;

    @Before
    public void init() {
        RefTypeA refTypeA1 = new RefTypeA();
        refTypeA1.setId(1L);
        refTypeA1.setValueA("refA1");
        RefTypeA refTypeA2 = new RefTypeA();
        refTypeA2.setValueA("refA2");
        refTypeA2.setId(2L);

        em.persist(refTypeA1);
        em.persist(refTypeA2);

        RefTypeB refTypeB1 = new RefTypeB();
        refTypeB1.setValueB("refB1");
        refTypeB1.setId(3L);
        RefTypeB refTypeB2 = new RefTypeB();
        refTypeA1.setValueA("refB2");
        refTypeB2.setId(4L);

        em.persist(refTypeB1);
        em.persist(refTypeB2);

        ItemTypeA itemTypeA1 = new ItemTypeA();
        itemTypeA1.set_refType(refTypeA1);
        itemTypeA1.setId(5L);
        ItemTypeA itemTypeA2 = new ItemTypeA();
        itemTypeA2.set_refType(refTypeA2);
        itemTypeA2.setId(6L);

        em.persist(itemTypeA1);
        em.persist(itemTypeA2);

        ItemTypeB itemTypeB1 = new ItemTypeB();
        itemTypeB1.set_refType(refTypeB1);
        itemTypeB1.setId(7L);
        ItemTypeB itemTypeB2 = new ItemTypeB();
        itemTypeB2.set_refType(refTypeB2);
        itemTypeB2.setId(8L);

        em.persist(itemTypeB1);
        em.persist(itemTypeB2);

//        Person p1 = new Person("P1");
//        Person p2 = new Person("P2");
//        Person p3 = new Person("P3");
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//
//        Cat c1 = new Cat("C1", 1, p2);
//        Cat c2 = new Cat("C2", 2, p2);
//        Cat c3 = new Cat("C3", 4, p2);
//
//        Cat c4 = new Cat("C4", 6, p3);
//
//        Cat c5 = new Cat("C5", 8, null);
//        Cat c6 = new Cat("C6", 7, null);
//
//        em.persist(c1);
//        em.persist(c2);
//        em.persist(c3);
//        em.persist(c4);
//        em.persist(c5);
//        em.persist(c6);
//
//        c1.setMother(c3);
//        c3.getKittens().add(c1);
//
//        c1.setFather(c5);
//        c5.getKittens().add(c1);
//
//        c2.setMother(c3);
//        c3.getKittens().add(c2);
//
//        c2.setFather(c6);
//        c6.getKittens().add(c2);
//
//        c4.setFather(c6);
//        c6.getKittens().add(c4);
    }
}
