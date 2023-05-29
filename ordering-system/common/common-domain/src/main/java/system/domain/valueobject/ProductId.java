package system.domain.valueobject;

import java.util.UUID;

/**
 * system.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class ProductId extends BaseId<UUID> {

    public ProductId(UUID value) {
        super(value);
    }
}

