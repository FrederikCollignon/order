package be.frederikcollignon.order.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    public String returnString() {
        return "Test Service!";
    }
}
