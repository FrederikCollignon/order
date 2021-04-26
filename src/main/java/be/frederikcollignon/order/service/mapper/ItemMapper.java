package be.frederikcollignon.order.service.mapper;

import be.frederikcollignon.order.domain.entity.Item;
import be.frederikcollignon.order.service.dto.request.AddItemDTO;
import be.frederikcollignon.order.service.dto.response.ItemDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item fromDto(AddItemDTO addItemDTO) {
        return new Item(
                addItemDTO.getName(),
                addItemDTO.getDescription(),
                addItemDTO.getPrice(),
                addItemDTO.getAmount()
        );
    }

    public ItemDTO toDto(Item item) {
        return new ItemDTO()
                .setId(item.getId())
                .setName(item.getName())
                .setDescription(item.getDescription())
                .setPrice(item.getPrice())
                .setAmount(item.getAmount());
    }
}
