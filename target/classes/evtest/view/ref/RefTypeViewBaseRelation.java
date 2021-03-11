package evtest.view.ref;

import com.blazebit.persistence.view.StaticRelation;
import com.blazebit.persistence.view.metamodel.AttributePath;
import com.blazebit.persistence.view.metamodel.AttributePathWrapper;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.MethodSingularAttribute;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticRelation(RefTypeViewBase.class)
public class RefTypeViewBaseRelation<T, A extends MethodAttribute<?, ?>> extends AttributePathWrapper<T, RefTypeViewBase, RefTypeViewBase> {

    public RefTypeViewBaseRelation(AttributePath<T, RefTypeViewBase, RefTypeViewBase> path) {
        super(path);
    }

    public AttributePath<T, Long, Long> id() {
        MethodSingularAttribute<RefTypeViewBase, Long> attribute = RefTypeViewBase_.id;
        return attribute == null ? getWrapped().<Long>get("id") : getWrapped().get(attribute);
    }

    public A attr() {
        return (A) getWrapped().getAttributes().get(getWrapped().getAttributes().size() - 1);
    }

}

