package kitchenpos.order.take_out_order.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TakeOutOrderRepository {
    TakeOutOrder save(TakeOutOrder order);

    Optional<TakeOutOrder> findById(UUID id);

    List<TakeOutOrder> findAll();
}
