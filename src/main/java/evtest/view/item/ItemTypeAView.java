package evtest.view.item;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.EntityViewInheritanceMapping;
import com.blazebit.persistence.view.Mapping;
import evtest.model.item.ItemTypeA;
import evtest.view.ref.RefTypeAView;

@EntityView(ItemTypeA.class)
@EntityViewInheritanceMapping("dscrItem = 'TYPE_A'")
public abstract class ItemTypeAView extends ItemTypeView<RefTypeAView> {
    @Mapping("TREAT(_refType AS RefTypeA)")
    public abstract RefTypeAView get_refType();

}
