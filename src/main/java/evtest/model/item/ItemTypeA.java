package evtest.model.item;

import evtest.model.ref.RefTypeA;

import javax.persistence.*;

@Entity
public class ItemTypeA extends ItemType {

    @Transient
    private RefTypeA _refItem;

    ///////////////////////////////////////////////////////////////////
    // Fields
    ///////////////////////////////////////////////////////////////////

    @Override
    public RefTypeA get_refType() {
        return (RefTypeA) super.get_refType();
    }

}
