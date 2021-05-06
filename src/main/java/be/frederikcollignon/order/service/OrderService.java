package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.domain.entity.Order;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.mapper.ItemGroupMapper;
import be.frederikcollignon.order.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    private final ItemGroupMapper itemGroupMapper;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(ItemGroupMapper itemGroupMapper, OrderMapper orderMapper) {
        this.itemGroupMapper = itemGroupMapper;
        this.orderMapper = orderMapper;
    }

    public String getString() {
        return "something";
    }

    public String createItemGroup(CreateItemGroupDTO createItemGroupDTO) {
        ItemGroup itemGroup = itemGroupMapper.fromDto(createItemGroupDTO);
        System.out.println(itemGroup);
        return "createItemGroup works";
    }

    public String createOrder(CreateOrderDTO createOrderDTO) {
        Order order = orderMapper.fromDto(createOrderDTO);
        System.out.println(order);
        return "createOrder works";
    }

//    public ItemDTO addItem(AddItemDTO addItemDTO) {
//        Item item = itemMapper.fromDto(addItemDTO);
//        Item addedItem = itemRepository.save(item);
//        return itemMapper.toDto(addedItem);
//    }
}
