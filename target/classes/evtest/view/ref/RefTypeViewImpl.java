package evtest.view.ref;

import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.SerializableEntityViewManager;
import com.blazebit.persistence.view.StaticImplementation;
import com.blazebit.persistence.view.spi.type.EntityViewProxy;
import evtest.model.ref.RefType;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticImplementation(RefTypeView.class)
public class RefTypeViewImpl implements RefTypeView, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(RefTypeViewImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;

    public RefTypeViewImpl(RefTypeViewImpl noop, Map<String, Object> optionalParameters) {
        this.id = null;
    }

    public RefTypeViewImpl(
        Long id
    ) {
        super();
        this.id = id;
    }

    public RefTypeViewImpl(RefTypeViewImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
    }

    public RefTypeViewImpl(RefTypeViewImpl noop, int offset, int[] assignment, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + assignment[0]];
    }


    @Override
    public Long getId() {
        return id;
    }


    private byte $$_kind;

    @Override
    public Class<?> $$_getJpaManagedClass() {
        return RefType.class;
    }
    @Override
    public Class<?> $$_getJpaManagedBaseClass() {
        return RefType.class;
    }
    @Override
    public Class<?> $$_getEntityViewClass() {
        return RefTypeView.class;
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
        if (obj instanceof RefTypeView) {
            RefTypeView other = (RefTypeView) obj;
            if (!Objects.equals(this.id, other.getId())) {
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
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    @Override
    public String toString() {
        return "RefTypeView(id = " + this.id + ")";
    }
}

