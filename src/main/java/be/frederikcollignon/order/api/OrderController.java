package be.frederikcollignon.order.api;

import be.frederikcollignon.order.service.OrderService;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.dto.response.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/orders", produces = "application/json")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(consumes = "application/json")
    public OrderDTO createOrder(@RequestBody CreateOrderDTO createOrderDTO) {
        return orderService.createOrder(createOrderDTO);
    }

}
