package evtest.view.item;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import evtest.model.item.ItemType;
import evtest.view.ref.RefTypeViewBase;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(ItemTypeBaseView.class)
public class ItemTypeBaseViewImpl extends ItemTypeBaseView implements EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(ItemTypeBaseViewImpl.class, ENTITY_VIEW_MANAGER);

    private final RefTypeViewBase _refType;
    private final long id;

    public ItemTypeBaseViewImpl(ItemTypeBaseViewImpl noop, Map<String, Object> optionalParameters) {
        this._refType = null;
        this.id = 0L;
    }

    public ItemTypeBaseViewImpl(        long id) {
        this.$$_kind = (byte) 1;
        this._refType = null;
        this.id = id;
    }

    public ItemTypeBaseViewImpl(
        long id,
        RefTypeViewBase _refType
    ) {
        super();
        this._refType = _refType;
        this.id = id;
    }

    public ItemTypeBaseViewImpl(ItemTypeBaseViewImpl noop, int offset, Object[] tuple) {
        super();
        this._refType = (RefTypeViewBase) tuple[offset + 1];
        this.id = (long) tuple[offset + 0];
    }

    public ItemTypeBaseViewImpl(ItemTypeBaseViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this._refType = (RefTypeViewBase) tuple[offset + assignment[1]];
        this.id = (long) tuple[offset + assignment[0]];
    }


    @Override
    public RefTypeViewBase get_refType() {
        return _refType;
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
        return ItemTypeBaseView.class;
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
        if (obj instanceof ItemTypeBaseView) {
            ItemTypeBaseView other = (ItemTypeBaseView) obj;
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
        return "ItemTypeBaseView(id = " + this.id + ")";
    }
}

