package kitchenpos.delivery_order.infra;

import kitchenpos.delivery_order.domain.DeliveryOrder;
import kitchenpos.delivery_order.domain.DeliveryOrderRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class InMemoryDeliveryOrderRepository implements DeliveryOrderRepository {
    private final Map<UUID, DeliveryOrder> orders = new HashMap<>();

    @Override
    public DeliveryOrder save(DeliveryOrder order) {
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Optional<DeliveryOrder> findById(UUID id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public List<DeliveryOrder> findAll() {
        return orders.values().stream().toList();
    }
}
