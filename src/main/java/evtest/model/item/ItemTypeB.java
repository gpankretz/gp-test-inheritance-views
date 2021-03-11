package evtest.model.item;

import evtest.model.ref.RefTypeB;

import javax.persistence.*;

@Entity
public class ItemTypeB extends ItemType {

    @Transient
    private RefTypeB _refItem;

    ///////////////////////////////////////////////////////////////////
    // Fields
    ///////////////////////////////////////////////////////////////////

    @Override
    public RefTypeB get_refType() {
        return (RefTypeB) super.get_refType();
    }

}
