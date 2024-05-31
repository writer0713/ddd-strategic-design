package kitchenpos.order_table.infra;

import kitchenpos.order_table.domain.OrderTable;
import kitchenpos.order_table.domain.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
