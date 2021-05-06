package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.Item;
import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.domain.entity.Order;
import be.frederikcollignon.order.domain.repository.ItemRepository;
import be.frederikcollignon.order.domain.repository.OrderRepository;
import be.frederikcollignon.order.service.dto.request.CreateCustomerDTO;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.dto.response.ItemDTO;
import be.frederikcollignon.order.service.dto.response.OrderDTO;
import be.frederikcollignon.order.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderService {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderRepository orderRepository, ItemRepository itemRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.itemRepository = itemRepository;
    }

    public OrderDTO createOrder(CreateOrderDTO createOrderDTO) {
        Order order = fromDto(createOrderDTO);
        Order createdOrder = orderRepository.save(order);
        return null;
    }

    public Order fromDto(CreateOrderDTO createOrderDTO) {
        return new Order(createOrderDTO.getItemGroupDTOList().stream().map(itemGroupDTO -> fromDto(itemGroupDTO)).collect(Collectors.toList()));
    }

    private ItemGroup fromDto(CreateItemGroupDTO itemGroupDTO) {
        return new ItemGroup(itemRepository.findById(itemGroupDTO.getItemId()).orElse(null),
                itemGroupDTO.getAmount(), calculateShippingDate(itemRepository.findById(itemGroupDTO.getItemId()).orElse(null), itemGroupDTO));
    }

    private LocalDate calculateShippingDate(Item item, CreateItemGroupDTO createItemGroupDTO) {
        if (item.getAmount() >= createItemGroupDTO.getAmount()) {
            return LocalDate.now().plusDays(1);
        } else {
            return LocalDate.now().plusDays(7);
        }
    }

}
