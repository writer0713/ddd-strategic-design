package kitchenpos.take_out_order.domain;

import kitchenpos.order.domain.OrderStatus;
import kitchenpos.order_table.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TakeOutOrderRepository {
    TakeOutOrder save(TakeOutOrder order);

    Optional<TakeOutOrder> findById(UUID id);

    List<TakeOutOrder> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}

