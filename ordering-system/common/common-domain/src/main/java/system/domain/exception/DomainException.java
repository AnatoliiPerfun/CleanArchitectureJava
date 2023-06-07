package system.domain.exception;

/**
 * system.domain.exception
 * CleanArch
 *
 * @author tolik
 * @Date 06.06.2023
 */
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
