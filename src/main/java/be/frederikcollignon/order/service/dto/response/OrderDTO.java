package be.frederikcollignon.order.service.dto.response;

import java.util.List;

public class OrderDTO {

    private int id;
    private List<ItemGroupDTO> itemGroupDTOList;

    public int getId() {
        return id;
    }

    public OrderDTO setId(int id) {
        this.id = id;
        return this;
    }

    public List<ItemGroupDTO> getItemGroupDTOList() {
        return itemGroupDTOList;
    }

    public OrderDTO setItemGroupDTOList(List<ItemGroupDTO> itemGroupDTOList) {
        this.itemGroupDTOList = itemGroupDTOList;
        return this;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", itemGroupDTOList=" + itemGroupDTOList +
                '}';
    }
}
