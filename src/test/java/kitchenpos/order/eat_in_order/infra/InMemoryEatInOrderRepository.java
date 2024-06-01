package kitchenpos.order.eat_in_order.infra;

import kitchenpos.order.eat_in_order.domain.eat_in_order.EatInOrder;
import kitchenpos.order.eat_in_order.domain.eat_in_order.EatInOrderRepository;
import kitchenpos.order.eat_in_order.domain.eat_in_order.OrderStatus;
import kitchenpos.order.eat_in_order.domain.order_table.OrderTable;

import java.util.*;

public class InMemoryEatInOrderRepository implements EatInOrderRepository {
    private final Map<UUID, EatInOrder> orders = new HashMap<>();

    @Override
    public EatInOrder save(final EatInOrder order) {
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Optional<EatInOrder> findById(final UUID id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public List<EatInOrder> findAll() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public boolean existsByOrderTableAndStatusNot(final OrderTable orderTable, final OrderStatus status) {
        return orders.values().stream().anyMatch(order -> order.getOrderTable().equals(orderTable) && order.getStatus() != status);
    }
}
