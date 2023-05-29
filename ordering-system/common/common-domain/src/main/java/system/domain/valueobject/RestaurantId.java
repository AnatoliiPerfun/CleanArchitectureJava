package system.domain.valueobject;

import java.util.UUID;

/**
 * system.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class RestaurantId extends BaseId<UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
