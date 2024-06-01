package kitchenpos.order.eat_in_order.domain.eat_in_order;

import kitchenpos.order.eat_in_order.domain.order_table.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EatInOrderRepository {
    EatInOrder save(EatInOrder order);

    Optional<EatInOrder> findById(UUID id);

    List<EatInOrder> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}

