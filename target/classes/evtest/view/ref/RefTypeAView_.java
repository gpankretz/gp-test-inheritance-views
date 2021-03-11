package evtest.view.ref;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(RefTypeAView.class)
public abstract class RefTypeAView_ {
    public static volatile MethodSingularAttribute<RefTypeAView, Long> id;
    public static volatile MethodSingularAttribute<RefTypeAView, String> valueA;

    public static final String ID = "id";
    public static final String VALUE_A = "valueA";

    public static EntityViewSetting<RefTypeAView, CriteriaBuilder<RefTypeAView>> createSettingInit() {
        return EntityViewSetting.create(RefTypeAView.class, "init");
    }
    public static EntityViewSetting<RefTypeAView, PaginatedCriteriaBuilder<RefTypeAView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(RefTypeAView.class, firstResult, maxResults, "init");
    }

}

