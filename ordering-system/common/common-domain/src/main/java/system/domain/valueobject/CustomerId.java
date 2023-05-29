package system.domain.valueobject;

import java.util.UUID;

/**
 * system.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class CustomerId  extends BaseId<UUID> {

    public CustomerId(UUID value) {
        super(value);
    }
}
