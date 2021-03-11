package evtest.view.ref;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import evtest.model.ref.RefType;

@EntityView(RefType.class)
public interface RefTypeViewBase {
    @IdMapping
    public Long getId();

}
