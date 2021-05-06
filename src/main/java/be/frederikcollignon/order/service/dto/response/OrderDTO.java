package be.frederikcollignon.order.service.dto.response;

import java.util.List;

public class OrderDTO {

    private int id;
    private List<ItemGroupDTO> itemGroupList;
    private double totalPrice;

    public int getId() {
        return id;
    }

    public OrderDTO setId(int id) {
        this.id = id;
        return this;
    }

    public List<ItemGroupDTO> getItemGroupList() {
        return itemGroupList;
    }

    public OrderDTO setItemGroupList(List<ItemGroupDTO> itemGroupList) {
        this.itemGroupList = itemGroupList;
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public OrderDTO setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
