package be.frederikcollignon.order.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders", produces = "application/json")
public class OrderController {

    @GetMapping(produces = "application/json")
    public String getString() {
        return "OrderController works";
    }
}
