package kitchenpos.take_out_order.infra;

import java.math.BigDecimal;
import java.util.UUID;

public interface KitchenridersClient {
    void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress);
}
