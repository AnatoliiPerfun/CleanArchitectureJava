package system.domain.entity;


import java.util.Objects;

/**
 * system.domain.entity
 * CleanArch
 *
 * @author tolik
 * @Date 26.05.2023
 */


public abstract class BaseEntity<ID> {

    private ID id;
    public ID getId() {
        return id;
    }
    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) object;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
