package kitchenpos.order.take_out_order.ui;

import kitchenpos.order.take_out_order.application.TakeOutOrderService;
import kitchenpos.order.take_out_order.domain.TakeOutOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/take_out_orders")
@RestController
public class TakeOutOrderRestController {
    private final TakeOutOrderService orderService;

    public TakeOutOrderRestController(final TakeOutOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<TakeOutOrder> create(@RequestBody final TakeOutOrder request) {
        final TakeOutOrder response = orderService.create(request);
        return ResponseEntity.created(URI.create("/api/orders/" + response.getId()))
                .body(response);
    }

    @PutMapping("/{orderId}/accept")
    public ResponseEntity<TakeOutOrder> accept(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.accept(orderId));
    }

    @PutMapping("/{orderId}/serve")
    public ResponseEntity<TakeOutOrder> serve(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.serve(orderId));
    }

    @PutMapping("/{orderId}/complete")
    public ResponseEntity<TakeOutOrder> complete(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.complete(orderId));
    }

    @GetMapping
    public ResponseEntity<List<TakeOutOrder>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }
}
