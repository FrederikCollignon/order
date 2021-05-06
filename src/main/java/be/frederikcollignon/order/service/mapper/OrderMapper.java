package be.frederikcollignon.order.service.mapper;

import be.frederikcollignon.order.domain.entity.Order;
import be.frederikcollignon.order.service.dto.request.CreateOrderDTO;
import be.frederikcollignon.order.service.dto.response.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderMapper {

    private final ItemGroupMapper itemGroupMapper;

    @Autowired
    public OrderMapper(ItemGroupMapper itemGroupMapper) {
        this.itemGroupMapper = itemGroupMapper;
    }

    public Order fromDto(CreateOrderDTO createOrderDTO) {
        return new Order(
                createOrderDTO.getCreateItemGroupDTOList().stream().map(itemGroupMapper::fromDto).collect(Collectors.toList())
        );
    }

    public OrderDTO toDto(Order order) {
        return new OrderDTO()
                .setId(order.getId())
                .setItemGroupDTOList(order.getItemGroupList().stream().map(itemGroupMapper::toDto).collect(Collectors.toList()));
    }

}
