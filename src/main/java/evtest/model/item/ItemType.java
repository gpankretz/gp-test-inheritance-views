package evtest.model.item;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemType extends ItemTypeSuper {
    private String dscrItem;

    public String getDscrItem() {
        return dscrItem;
    }

    public void setDscrItem(String dscrItem) {
        this.dscrItem = dscrItem;
    }
}
