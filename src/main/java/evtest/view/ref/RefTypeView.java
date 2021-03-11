package evtest.view.ref;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.EntityViewInheritance;
import evtest.model.ref.RefType;

@EntityView(RefType.class)
@EntityViewInheritance
public interface RefTypeView extends RefTypeViewBase {}
