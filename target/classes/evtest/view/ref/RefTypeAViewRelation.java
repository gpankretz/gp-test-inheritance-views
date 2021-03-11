package evtest.view.ref;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(RefTypeAView.class)
public class RefTypeAViewRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, RefTypeAView, RefTypeAView> {

    public RefTypeAViewRelation(AttributePath<T, RefTypeAView, RefTypeAView> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<RefTypeAView, Long> attribute = RefTypeAView_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public AttributePath<T, String, String> valueA() {
        MethodSingularAttribute<RefTypeAView, String> attribute = RefTypeAView_.valueA;
        return attribute == null ? getWrapped().<String>get("valueA") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

