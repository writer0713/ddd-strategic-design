package kitchenpos.order.eat_in_order.ui;

import kitchenpos.order.eat_in_order.application.EatInOrderService;
import kitchenpos.order.eat_in_order.domain.EatInOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/eat_in_orders")
@RestController
public class EatInOrderRestController {
    private final EatInOrderService orderService;

    public EatInOrderRestController(final EatInOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<EatInOrder> create(@RequestBody final EatInOrder request) {
        final EatInOrder response = orderService.create(request);
        return ResponseEntity.created(URI.create("/api/orders/" + response.getId()))
                .body(response);
    }

    @PutMapping("/{orderId}/accept")
    public ResponseEntity<EatInOrder> accept(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.accept(orderId));
    }

    @PutMapping("/{orderId}/serve")
    public ResponseEntity<EatInOrder> serve(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.serve(orderId));
    }


    @PutMapping("/{orderId}/complete")
    public ResponseEntity<EatInOrder> complete(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.complete(orderId));
    }

    @GetMapping
    public ResponseEntity<List<EatInOrder>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }
}
