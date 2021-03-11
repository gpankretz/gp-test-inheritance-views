package evtest.view.ref;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import evtest.model.ref.RefTypeA;

@EntityView(RefTypeA.class)
public interface RefTypeAView extends RefTypeView {
    @IdMapping
    public Long getId();

    public String getValueA();

}
