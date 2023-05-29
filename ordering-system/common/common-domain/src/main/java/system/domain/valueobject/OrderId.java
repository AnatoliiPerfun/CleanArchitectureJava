package system.domain.valueobject;

import java.util.UUID;

/**
 * system.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 29.05.2023
 */
public class OrderId extends BaseId<UUID>{
      public OrderId(UUID value) {
         super(value);
      }
}
