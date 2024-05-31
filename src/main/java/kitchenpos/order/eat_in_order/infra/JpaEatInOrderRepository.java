package kitchenpos.order.eat_in_order.infra;

import kitchenpos.order.eat_in_order.domain.EatInOrder;
import kitchenpos.order.eat_in_order.domain.EatInOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaEatInOrderRepository extends EatInOrderRepository, JpaRepository<EatInOrder, UUID> {
}
