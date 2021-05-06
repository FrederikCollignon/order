package be.frederikcollignon.order.api;

import be.frederikcollignon.order.service.OrderService;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/orders", produces = "application/json")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(produces = "application/json")
    public String getString() {
        return orderService.getString();
    }

    @PostMapping(consumes = "application/json")
    public String createOrder(@RequestBody CreateOrderDTO createOrderDTO) {
        return orderService.createOrder(createOrderDTO);
    }
}
