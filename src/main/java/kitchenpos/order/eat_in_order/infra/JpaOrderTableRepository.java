package kitchenpos.order.eat_in_order.infra;

import kitchenpos.order.eat_in_order.domain.order_table.OrderTable;
import kitchenpos.order.eat_in_order.domain.order_table.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
