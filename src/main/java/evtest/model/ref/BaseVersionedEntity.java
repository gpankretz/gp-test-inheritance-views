package evtest.model.ref;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseVersionedEntity {
    private Long idGroup;

    public Long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Long idGroup) {
        this.idGroup = idGroup;
    }
}
