package evtest.view.item;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.EntityViewInheritanceMapping;
import com.blazebit.persistence.view.Mapping;
import evtest.model.item.ItemTypeB;
import evtest.view.ref.RefTypeBView;

@EntityView(ItemTypeB.class)
@EntityViewInheritanceMapping("dscrItem = 'TYPE_B'")
public abstract class ItemTypeBView extends ItemTypeView<RefTypeBView> {
    @Mapping("TREAT(_refType AS RefTypeB)")
    public abstract RefTypeBView get_refType();

}
