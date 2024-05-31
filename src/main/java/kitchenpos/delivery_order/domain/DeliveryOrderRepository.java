package kitchenpos.delivery_order.domain;

import kitchenpos.order.domain.OrderStatus;
import kitchenpos.order_table.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeliveryOrderRepository {
    DeliveryOrder save(DeliveryOrder order);

    Optional<DeliveryOrder> findById(UUID id);

    List<DeliveryOrder> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}
