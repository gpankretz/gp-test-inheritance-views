package evtest.view.item;

import com.blazebit.persistence.CriteriaBuilder;
import com.blazebit.persistence.PaginatedCriteriaBuilder;
import com.blazebit.persistence.view.EntityViewSetting;
import com.blazebit.persistence.view.StaticMetamodel;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeAView;
import evtest.view.ref.RefTypeAViewRelation;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticMetamodel(ItemTypeAView.class)
public abstract class ItemTypeAView_ {
    public static volatile RefTypeAViewRelation<ItemTypeAView, MethodSingularAttribute<ItemTypeAView, RefTypeAView>> _refType;
    public static volatile MethodSingularAttribute<ItemTypeAView, String> dscrItem;
    public static volatile MethodSingularAttribute<ItemTypeAView, Long> id;

    public static final String _REF_TYPE = "_refType";
    public static final String DSCR_ITEM = "dscrItem";
    public static final String ID = "id";
    public static final String _REF_TYPEID = "_refType.id";
    public static final String _REF_TYPEVALUE_A = "_refType.valueA";

    public static EntityViewSetting<ItemTypeAView, CriteriaBuilder<ItemTypeAView>> createSettingInit() {
        return EntityViewSetting.create(ItemTypeAView.class, "init");
    }
    public static EntityViewSetting<ItemTypeAView, PaginatedCriteriaBuilder<ItemTypeAView>> createPaginatedSettingInit(int firstResult, int maxResults) {
        return EntityViewSetting.create(ItemTypeAView.class, firstResult, maxResults, "init");
    }

}

