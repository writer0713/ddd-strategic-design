package kitchenpos.eat_in_order.infra;

import kitchenpos.eat_in_order.domain.EatInOrder;
import kitchenpos.eat_in_order.domain.EatInOrderRepository;
import kitchenpos.eat_in_order.domain.OrderStatus;
import kitchenpos.order_table.domain.OrderTable;

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