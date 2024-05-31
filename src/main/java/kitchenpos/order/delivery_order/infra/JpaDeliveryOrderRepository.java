package kitchenpos.order.delivery_order.infra;

import kitchenpos.order.delivery_order.domain.DeliveryOrder;
import kitchenpos.order.delivery_order.domain.DeliveryOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaDeliveryOrderRepository extends DeliveryOrderRepository, JpaRepository<DeliveryOrder, UUID> {
}
