package evtest.view.item;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import evtest.model.item.ItemType;
import evtest.view.ref.RefTypeView;
import evtest.view.ref.RefTypeViewBase;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(ItemTypeView.class)
public class ItemTypeViewImpl<T extends RefTypeView> extends ItemTypeView<T> implements EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(ItemTypeViewImpl.class, ENTITY_VIEW_MANAGER);

    private final RefTypeViewBase _refType;
    private final String dscrItem;
    private final long id;

    public ItemTypeViewImpl(ItemTypeViewImpl noop, Map<String, Object> optionalParameters) {
        this._refType = null;
        this.dscrItem = null;
        this.id = 0L;
    }

    public ItemTypeViewImpl(        long id) {
        this.$$_kind = (byte) 1;
        this._refType = null;
        this.dscrItem = null;
        this.id = id;
    }

    public ItemTypeViewImpl(
        long id,
        RefTypeViewBase _refType,
        String dscrItem
    ) {
        super();
        this._refType = _refType;
        this.dscrItem = dscrItem;
        this.id = id;
    }

    public ItemTypeViewImpl(ItemTypeViewImpl noop, int offset, Object[] tuple) {
        super();
        this._refType = (RefTypeViewBase) tuple[offset + 1];
        this.dscrItem = (String) tuple[offset + 2];
        this.id = (long) tuple[offset + 0];
    }

    public ItemTypeViewImpl(ItemTypeViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this._refType = (RefTypeViewBase) tuple[offset + assignment[1]];
        this.dscrItem = (String) tuple[offset + assignment[2]];
        this.id = (long) tuple[offset + assignment[0]];
    }


    @Override
    public RefTypeViewBase get_refType() {
        return _refType;
    }
    @Override
    public String getDscrItem() {
        return dscrItem;
    }
    @Override
    public long getId() {
        return id;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return ItemType.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return ItemType.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return ItemTypeView.class;
    }
    @Override
    public boolean $$_isNew() {
        return false;
    }
    @Override
    public boolean $$_isReference() {
        return $$_kind == (byte) 1;
    }
    @Override
    public Object $$_getId() {
        return id;
    }
    @Override
    public Object $$_getVersion() {
        return null;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.$$_getId() == null) {
            return false;
        }
        if (obj instanceof EntityViewProxy) {
            EntityViewProxy other = (EntityViewProxy) obj;
            if (this.$$_getJpaManagedBaseClass() == other.$$_getJpaManagedBaseClass() && this.$$_getId().equals(other.$$_getId())) {
                return true;
            } else {
                return false;
            }
        }
        if (obj instanceof ItemTypeView) {
            ItemTypeView other = (ItemTypeView) obj;
            if (this.id != other.getId()) {
                return false;
            }
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        long bits;
        int hash = 3;
        hash = 83 * hash + (int)(this.id ^ (this.id >>> 32));
        return hash;
    }
    @Override
    public String toString() {
        return "ItemTypeView(id = " + this.id + ")";
    }
}

