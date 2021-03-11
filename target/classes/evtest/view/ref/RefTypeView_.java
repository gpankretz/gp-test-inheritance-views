package evtest.view.ref;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(RefTypeView.class)
public abstract class RefTypeView_ {
    public static volatile MethodSingularAttribute<RefTypeView, Long> id;

    public static final String ID = "id";

    public static EntityViewSetting<RefTypeView, CriteriaBuilder<RefTypeView>> createSettingInit() {
        return EntityViewSetting.create(RefTypeView.class, "init");
    }
    public static EntityViewSetting<RefTypeView, PaginatedCriteriaBuilder<RefTypeView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(RefTypeView.class, firstResult, maxResults, "init");
    }

}

