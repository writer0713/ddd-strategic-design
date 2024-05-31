package kitchenpos.order.take_out_order.infra;

import kitchenpos.order.take_out_order.domain.TakeOutOrder;
import kitchenpos.order.take_out_order.domain.TakeOutOrderRepository;

import java.util.*;

public class InMemoryTakeOutOrderRepository implements TakeOutOrderRepository {
    private final Map<UUID, TakeOutOrder> orders = new HashMap<>();

    @Override
    public TakeOutOrder save(TakeOutOrder order) {
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Optional<TakeOutOrder> findById(UUID id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public List<TakeOutOrder> findAll() {
        return orders.values().stream().toList();
    }
}
