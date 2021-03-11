package evtest.view.item;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeBView;
import evtest.view.ref.RefTypeBViewRelation;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(ItemTypeBView.class)
public abstract class ItemTypeBView_ {
    public static volatile RefTypeBViewRelation<ItemTypeBView, MethodSingularAttribute<ItemTypeBView, RefTypeBView>> _refType;
    public static volatile MethodSingularAttribute<ItemTypeBView, String> dscrItem;
    public static volatile MethodSingularAttribute<ItemTypeBView, Long> id;

    public static final String _REF_TYPE = "_refType";
    public static final String DSCR_ITEM = "dscrItem";
    public static final String ID = "id";
    public static final String _REF_TYPEID = "_refType.id";
    public static final String _REF_TYPEVALUE_B = "_refType.valueB";

    public static EntityViewSetting<ItemTypeBView, CriteriaBuilder<ItemTypeBView>> createSettingInit() {
        return EntityViewSetting.create(ItemTypeBView.class, "init");
    }
    public static EntityViewSetting<ItemTypeBView, PaginatedCriteriaBuilder<ItemTypeBView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ItemTypeBView.class, firstResult, maxResults, "init");
    }

}

