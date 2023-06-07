package system.order.service.domain.exception;

import system.domain.exception.DomainException;

/**
 * system.order.service.domain.exception
 * CleanArch
 *
 * @author tolik
 * @Date 06.06.2023
 */
public class OrderDomainException extends DomainException {


    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
