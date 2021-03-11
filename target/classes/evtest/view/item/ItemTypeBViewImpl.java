package evtest.view.item;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import evtest.model.item.ItemType;
import evtest.model.item.ItemTypeB;
import evtest.view.ref.RefTypeBView;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(ItemTypeBView.class)
public class ItemTypeBViewImpl extends ItemTypeBView implements EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(ItemTypeBViewImpl.class, ENTITY_VIEW_MANAGER);

    private final RefTypeBView _refType;
    private final String dscrItem;
    private final long id;

    public ItemTypeBViewImpl(ItemTypeBViewImpl noop, Map<String, Object> optionalParameters) {
        this._refType = null;
        this.dscrItem = null;
        this.id = 0L;
    }

    public ItemTypeBViewImpl(        long id) {
        this.$$_kind = (byte) 1;
        this._refType = null;
        this.dscrItem = null;
        this.id = id;
    }

    public ItemTypeBViewImpl(
        long id,
        RefTypeBView _refType,
        String dscrItem
    ) {
        super();
        this._refType = _refType;
        this.dscrItem = dscrItem;
        this.id = id;
    }

    public ItemTypeBViewImpl(ItemTypeBViewImpl noop, int offset, Object[] tuple) {
        super();
        this._refType = (RefTypeBView) tuple[offset + 1];
        this.dscrItem = (String) tuple[offset + 2];
        this.id = (long) tuple[offset + 0];
    }

    public ItemTypeBViewImpl(ItemTypeBViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this._refType = (RefTypeBView) tuple[offset + assignment[1]];
        this.dscrItem = (String) tuple[offset + assignment[2]];
        this.id = (long) tuple[offset + assignment[0]];
    }


    @Override
    public RefTypeBView get_refType() {
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
        return ItemTypeB.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return ItemType.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return ItemTypeBView.class;
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
        if (obj instanceof ItemTypeBView) {
            ItemTypeBView other = (ItemTypeBView) obj;
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
        return "ItemTypeBView(id = " + this.id + ")";
    }
}

