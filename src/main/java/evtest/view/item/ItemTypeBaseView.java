package evtest.view.item;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import evtest.model.item.ItemType;
import evtest.view.ref.RefTypeViewBase;


@EntityView(ItemType.class)
public abstract class ItemTypeBaseView {
    @IdMapping
    public abstract long getId();

    public abstract RefTypeViewBase get_refType();

}
