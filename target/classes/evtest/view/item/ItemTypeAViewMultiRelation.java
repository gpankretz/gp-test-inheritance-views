package evtest.view.item;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodPluralAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeAView;
import evtest.view.ref.RefTypeAViewRelation;
import java.util.Collection;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ItemTypeAView.class)
public class ItemTypeAViewMultiRelation<T, C extends Collection<ItemTypeAView>, A extends MethodPluralAttribute<?, ?, C>> extends AttributePathWrapper<T, ItemTypeAView, C> {

    public ItemTypeAViewMultiRelation(AttributePath<T, ItemTypeAView, C> path) {
        super(path);
    }

    public RefTypeAViewRelation<T, MethodSingularAttribute<ItemTypeAView, RefTypeAView>> _refType() {
        RefTypeAViewRelation<ItemTypeAView, MethodSingularAttribute<ItemTypeAView, RefTypeAView>> relation = ItemTypeAView_._refType;
        return new RefTypeAViewRelation<>(relation == null ? getWrapped().<RefTypeAView>get("_refType") : getWrapped().get(relation));
    }

    public AttributePath<T, String, String> dscrItem() {
        MethodSingularAttribute<ItemTypeAView, String> attribute = ItemTypeAView_.dscrItem;
        return attribute == null ? getWrapped().<String>get("dscrItem") : getWrapped().get(attribute);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ItemTypeAView, Long> attribute = ItemTypeAView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

