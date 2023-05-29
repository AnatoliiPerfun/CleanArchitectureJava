package system.domain.valueobject;

/**
 * system.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public abstract class BaseId<T> {

    private final T value;

    protected BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
