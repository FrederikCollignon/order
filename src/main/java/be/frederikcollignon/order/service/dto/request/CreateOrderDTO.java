package be.frederikcollignon.order.service.dto.request;

import java.util.List;

public class CreateOrderDTO {

    private List<CreateItemGroupDTO> createItemGroupDTOList;

    public List<CreateItemGroupDTO> getCreateItemGroupDTOList() {
        return createItemGroupDTOList;
    }

    @Override
    public String toString() {
        return "CreateOrderDTO{" +
                "createItemGroupDTOList=" + createItemGroupDTOList +
                '}';
    }
}
