package evtest.view.ref;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(RefTypeBView.class)
public class RefTypeBViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, RefTypeBView, RefTypeBView> {

    public RefTypeBViewRelation(AttributePath<T, RefTypeBView, RefTypeBView> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<RefTypeBView, Long> attribute = RefTypeBView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> valueB() {
        MethodSingularAttribute<RefTypeBView, String> attribute = RefTypeBView_.valueB;
        return attribute == null ? getWrapped().<String>get("valueB") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

