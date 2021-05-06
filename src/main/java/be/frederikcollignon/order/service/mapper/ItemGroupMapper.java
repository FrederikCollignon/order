package be.frederikcollignon.order.service.mapper;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.dto.response.ItemGroupDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemGroupMapper {

    public ItemGroup fromDto(CreateItemGroupDTO createItemGroupDTO) {
        return new ItemGroup(
                createItemGroupDTO.getItemId(),
                createItemGroupDTO.getAmount(),
                createItemGroupDTO.getShippingDate()
        );
    }

    public ItemGroupDTO toDto(ItemGroup itemGroup) {
        return new ItemGroupDTO()
                .setId(itemGroup.getId())
                .setItemId(itemGroup.getItemId())
                .setAmount(itemGroup.getAmount())
                .setShippingDate(itemGroup.getShippingDate());
    }

}
