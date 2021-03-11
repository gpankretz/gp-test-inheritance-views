package evtest.view.ref;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import evtest.model.ref.RefTypeB;

@EntityView(RefTypeB.class)
public interface RefTypeBView extends RefTypeView {
    @IdMapping
    public Long getId();

    public String getValueB();

}
