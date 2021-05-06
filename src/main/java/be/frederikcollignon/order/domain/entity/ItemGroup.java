package be.frederikcollignon.order.domain.entity;

import java.time.LocalDate;

public class ItemGroup {

    private Integer id;
    private int itemId;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroup() {
    }

    public ItemGroup(int itemId, int amount, LocalDate shippingDate) {
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public Integer getId() {
        return id;
    }

    public int getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", amount=" + amount +
                ", shippingDate=" + shippingDate +
                '}';
    }
}
