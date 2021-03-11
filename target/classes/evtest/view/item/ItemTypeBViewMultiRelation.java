package evtest.view.item;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeBView;
import evtest.view.ref.RefTypeBViewRelation;
import java.util.Collection;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ItemTypeBView.class)
public class ItemTypeBViewMultiRelation<T, C extends Collection<ItemTypeBView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, ItemTypeBView, C> {

    public ItemTypeBViewMultiRelation(AttributePath<T, ItemTypeBView, C> path) {
        super(path);
    }

    public RefTypeBViewRelation<T, MethodSingularAttribute<ItemTypeBView, RefTypeBView>> _refType() {
        RefTypeBViewRelation<ItemTypeBView, MethodSingularAttribute<ItemTypeBView, RefTypeBView>> relation = ItemTypeBView_._refType;
        return new RefTypeBViewRelation<>(relation == null ? getWrapped().<RefTypeBView>get("_refType") : getWrapped().get(relation));
    }

    public AttributePath<T, String, String> dscrItem() {
        MethodSingularAttribute<ItemTypeBView, String> attribute = ItemTypeBView_.dscrItem;
        return attribute == null ? getWrapped().<String>get("dscrItem") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ItemTypeBView, Long> attribute = ItemTypeBView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

