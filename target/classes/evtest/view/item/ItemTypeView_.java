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
@StaticMetamodel(ItemTypeView.class)
public abstract class ItemTypeView_ {
    public static volatile RefTypeViewBaseRelation<ItemTypeView, MethodSingularAttribute<ItemTypeView, RefTypeViewBase>> _refType;
    public static volatile MethodSingularAttribute<ItemTypeView, String> dscrItem;
    public static volatile MethodSingularAttribute<ItemTypeView, Long> id;

    public static final String _REF_TYPE = "_refType";
    public static final String DSCR_ITEM = "dscrItem";
    public static final String ID = "id";
    public static final String _REF_TYPEID = "_refType.id";

    public static EntityViewSetting<ItemTypeView, CriteriaBuilder<ItemTypeView>> createSettingInit() {
        return EntityViewSetting.create(ItemTypeView.class, "init");
    }
    public static EntityViewSetting<ItemTypeView, PaginatedCriteriaBuilder<ItemTypeView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ItemTypeView.class, firstResult, maxResults, "init");
    }

}

