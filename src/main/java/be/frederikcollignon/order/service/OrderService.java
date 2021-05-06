package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.domain.entity.Order;
import be.frederikcollignon.order.domain.repository.ItemGroupRepository;
import be.frederikcollignon.order.domain.repository.OrderRepository;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.dto.response.ItemGroupDTO;
import be.frederikcollignon.order.service.dto.response.OrderDTO;
import be.frederikcollignon.order.service.mapper.ItemGroupMapper;
import be.frederikcollignon.order.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    private final ItemGroupRepository itemGroupRepository;
    private final OrderRepository orderRepository;
    private final ItemGroupMapper itemGroupMapper;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(ItemGroupMapper itemGroupMapper, OrderMapper orderMapper, ItemGroupRepository itemGroupRepository, OrderRepository orderRepository) {
        this.itemGroupMapper = itemGroupMapper;
        this.orderMapper = orderMapper;
        this.itemGroupRepository = itemGroupRepository;
        this.orderRepository = orderRepository;
    }

    public String getString() {
        return "something";
    }

    public ItemGroupDTO createItemGroup(CreateItemGroupDTO createItemGroupDTO) {
        ItemGroup itemGroup = itemGroupMapper.fromDto(createItemGroupDTO);
        ItemGroup createdItemGroup = itemGroupRepository.save(itemGroup);
        return itemGroupMapper.toDto(createdItemGroup);
    }

    public OrderDTO createOrder(CreateOrderDTO createOrderDTO) {
        Order order = orderMapper.fromDto(createOrderDTO);
        Order createdOrder = orderRepository.save(order);
        return orderMapper.toDto(createdOrder);
    }

}
