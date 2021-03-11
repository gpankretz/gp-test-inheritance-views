package evtest.view.item;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeViewBase;
import evtest.view.ref.RefTypeViewBaseRelation;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(ItemTypeBaseView.class)
public abstract class ItemTypeBaseView_ {
    public static volatile RefTypeViewBaseRelation<ItemTypeBaseView, MethodSingularAttribute<ItemTypeBaseView, RefTypeViewBase>> _refType;
    public static volatile MethodSingularAttribute<ItemTypeBaseView, Long> id;

    public static final String _REF_TYPE = "_refType";
    public static final String ID = "id";
    public static final String _REF_TYPEID = "_refType.id";

    public static EntityViewSetting<ItemTypeBaseView, CriteriaBuilder<ItemTypeBaseView>> createSettingInit() {
        return EntityViewSetting.create(ItemTypeBaseView.class, "init");
    }
    public static EntityViewSetting<ItemTypeBaseView, PaginatedCriteriaBuilder<ItemTypeBaseView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ItemTypeBaseView.class, firstResult, maxResults, "init");
    }

}

