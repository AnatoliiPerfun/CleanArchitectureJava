package system.order.service.domain.valueobject;

import system.domain.valueobject.BaseId;

/**
 * system.order.service.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class OrderItemId extends BaseId<Long> {


    protected OrderItemId(Long value) {
        super(value);
    }
}
