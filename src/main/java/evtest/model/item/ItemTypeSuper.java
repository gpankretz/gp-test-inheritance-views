package evtest.model.item;

import evtest.model.ref.RefType;

import javax.persistence.*;

@MappedSuperclass
public abstract class ItemTypeSuper {

    @Id
    private long id;

    @ManyToOne
    private RefType _refType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    ///////////////////////////////////////////////////////////////////
    // Keys
    ///////////////////////////////////////////////////////////////////

    public RefType get_refType() {
        return _refType;
    }

    public void set_refType(RefType _refType) {
        this._refType = _refType;
    }
}
