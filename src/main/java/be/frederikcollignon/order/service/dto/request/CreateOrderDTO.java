package be.frederikcollignon.order.service.dto.request;

import java.util.List;

public class CreateOrderDTO {

    private List<CreateItemGroupDTO> itemGroupDTOList;

    public List<CreateItemGroupDTO> getItemGroupDTOList() {
        return itemGroupDTOList;
    }
}
