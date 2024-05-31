package kitchenpos.order.take_out_order.infra;

import kitchenpos.order.take_out_order.domain.TakeOutOrder;
import kitchenpos.order.take_out_order.domain.TakeOutOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaTakeOutOrderRepository extends TakeOutOrderRepository, JpaRepository<TakeOutOrder, UUID> {
}
