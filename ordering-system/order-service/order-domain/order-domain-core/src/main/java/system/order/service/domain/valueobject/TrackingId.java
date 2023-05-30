package system.order.service.domain.valueobject;

import system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * system.order.service.domain.valueobject
 * CleanArch
 *
 * @author tolik
 * @Date 30.05.2023
 */
public class TrackingId extends BaseId<UUID> {

      public TrackingId(UUID value) {
         super(value);
      }
}
