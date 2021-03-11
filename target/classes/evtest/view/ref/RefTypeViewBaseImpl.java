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
@StaticImplementation(RefTypeViewBase.class)
public class RefTypeViewBaseImpl implements RefTypeViewBase, EntityViewProxy {

    public static volatile EntityViewManager ENTITY_VIEW_MANAGER;
    public static final SerializableEntityViewManager SERIALIZABLE_ENTITY_VIEW_MANAGER = new SerializableEntityViewManager(RefTypeViewBaseImpl.class, ENTITY_VIEW_MANAGER);

    private final Long id;

    public RefTypeViewBaseImpl(RefTypeViewBaseImpl noop, Map<String, Object> optionalParameters) {
        this.id = null;
    }

    public RefTypeViewBaseImpl(
        Long id
    ) {
        super();
        this.id = id;
    }

    public RefTypeViewBaseImpl(RefTypeViewBaseImpl noop, int offset, Object[] tuple) {
        super();
        this.id = (Long) tuple[offset + 0];
    }

    public RefTypeViewBaseImpl(RefTypeViewBaseImpl noop, int offset, int[] assignment, Object[] tuple) {
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
        return RefTypeViewBase.class;
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
        if (obj instanceof RefTypeViewBase) {
            RefTypeViewBase other = (RefTypeViewBase) obj;
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
        return "RefTypeViewBase(id = " + this.id + ")";
    }
}

