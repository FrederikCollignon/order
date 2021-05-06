package be.frederikcollignon.order.service.dto.response;

import java.time.LocalDate;

public class ItemGroupDTO {

    private int id;
    private int itemId;
    private int amount;
    private LocalDate shippingDate;

    public int getId() {
        return id;
    }

    public ItemGroupDTO setId(int id) {
        this.id = id;
        return this;
    }

    public int getItemId() {
        return itemId;
    }

    public ItemGroupDTO setItemId(int itemId) {
        this.itemId = itemId;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ItemGroupDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public ItemGroupDTO setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }

    @Override
    public String toString() {
        return "ItemGroupDTO{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", amount=" + amount +
                ", shippingDate=" + shippingDate +
                '}';
    }
}
