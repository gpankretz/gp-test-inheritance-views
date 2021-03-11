package evtest.view.ref;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(RefTypeBView.class)
public abstract class RefTypeBView_ {
    public static volatile MethodSingularAttribute<RefTypeBView, Long> id;
    public static volatile MethodSingularAttribute<RefTypeBView, String> valueB;

    public static final String ID = "id";
    public static final String VALUE_B = "valueB";

    public static EntityViewSetting<RefTypeBView, CriteriaBuilder<RefTypeBView>> createSettingInit() {
        return EntityViewSetting.create(RefTypeBView.class, "init");
    }
    public static EntityViewSetting<RefTypeBView, PaginatedCriteriaBuilder<RefTypeBView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(RefTypeBView.class, firstResult, maxResults, "init");
    }

}

