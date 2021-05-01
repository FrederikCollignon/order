package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.Order;
import be.frederikcollignon.order.domain.repository.OrderRepository;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.dto.response.OrderDTO;
import be.frederikcollignon.order.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    public OrderDTO createOrder(CreateOrderDTO createOrderDTO) {
        Order order = orderMapper.fromDto(createOrderDTO);
        Order createdOrder = orderRepository.save(order);
        return orderMapper.toDto(createdOrder);
    }

}
