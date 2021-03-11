package evtest.view.ref;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(RefTypeViewBase.class)
public abstract class RefTypeViewBase_ {
    public static volatile MethodSingularAttribute<RefTypeViewBase, Long> id;

    public static final String ID = "id";

    public static EntityViewSetting<RefTypeViewBase, CriteriaBuilder<RefTypeViewBase>> createSettingInit() {
        return EntityViewSetting.create(RefTypeViewBase.class, "init");
    }
    public static EntityViewSetting<RefTypeViewBase, PaginatedCriteriaBuilder<RefTypeViewBase>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(RefTypeViewBase.class, firstResult, maxResults, "init");
    }

}

