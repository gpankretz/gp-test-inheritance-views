package evtest.view.item;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import evtest.view.ref.RefTypeViewBase;
import evtest.view.ref.RefTypeViewBaseRelation;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(ItemTypeBaseView.class)
public class ItemTypeBaseViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, ItemTypeBaseView, ItemTypeBaseView> {

    public ItemTypeBaseViewRelation(AttributePath<T, ItemTypeBaseView, ItemTypeBaseView> path) {
        super(path);
    }

    public RefTypeViewBaseRelation<T, MethodSingularAttribute<ItemTypeBaseView, RefTypeViewBase>> _refType() {
        RefTypeViewBaseRelation<ItemTypeBaseView, MethodSingularAttribute<ItemTypeBaseView, RefTypeViewBase>> relation = ItemTypeBaseView_._refType;
        return new RefTypeViewBaseRelation<>(relation == null ? getWrapped().<RefTypeViewBase>get("_refType") : getWrapped().get(relation));
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<ItemTypeBaseView, Long> attribute = ItemTypeBaseView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

