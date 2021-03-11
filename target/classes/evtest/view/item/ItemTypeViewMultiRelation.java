package evtest.view.item;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeViewBase;
import evtest.view.ref.RefTypeViewBaseRelation;
import java.util.Collection;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ItemTypeView.class)
public class ItemTypeViewMultiRelation<T, C extends Collection<ItemTypeView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, ItemTypeView, C> {

    public ItemTypeViewMultiRelation(AttributePath<T, ItemTypeView, C> path) {
        super(path);
    }

    public RefTypeViewBaseRelation<T, MethodSingularAttribute<ItemTypeView, RefTypeViewBase>> _refType() {
        RefTypeViewBaseRelation<ItemTypeView, MethodSingularAttribute<ItemTypeView, RefTypeViewBase>> relation = ItemTypeView_._refType;
        return new RefTypeViewBaseRelation<>(relation == null ? getWrapped().<RefTypeViewBase>get("_refType") : getWrapped().get(relation));
    }

    public AttributePath<T, String, String> dscrItem() {
        MethodSingularAttribute<ItemTypeView, String> attribute = ItemTypeView_.dscrItem;
        return attribute == null ? getWrapped().<String>get("dscrItem") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ItemTypeView, Long> attribute = ItemTypeView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

