package evtest.view.item;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.EntityViewInheritance;
import evtest.model.item.ItemType;
import evtest.view.ref.RefTypeView;

/**
 * Used by TxnTransactionTableView for exporting the txn table
 */

@EntityView(ItemType.class)
@EntityViewInheritance
public abstract class ItemTypeView<T extends RefTypeView> extends ItemTypeBaseView {

    public abstract String getDscrItem();
}
