package be.frederikcollignon.order.domain.entity;

import java.util.List;

public class Order {

    private Integer id;
    private List<ItemGroup> itemGroupList;

    public Order() {
    }

    public Order(List<ItemGroup> itemGroupList) {
        this.itemGroupList = itemGroupList;
    }

    public Integer getId() {
        return id;
    }

    public List<ItemGroup> getItemGroupList() {
        return itemGroupList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemGroupList=" + itemGroupList +
                '}';
    }
}
