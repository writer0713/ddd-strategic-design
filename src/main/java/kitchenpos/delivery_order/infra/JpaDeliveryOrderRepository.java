package kitchenpos.delivery_order.infra;

import kitchenpos.delivery_order.domain.DeliveryOrder;
import kitchenpos.delivery_order.domain.DeliveryOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaDeliveryOrderRepository extends DeliveryOrderRepository, JpaRepository<DeliveryOrder, UUID> {
}
