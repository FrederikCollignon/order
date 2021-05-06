package be.frederikcollignon.order.service.mapper;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
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

}
