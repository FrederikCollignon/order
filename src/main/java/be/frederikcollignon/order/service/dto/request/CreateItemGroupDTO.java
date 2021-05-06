package be.frederikcollignon.order.service.dto.request;

import java.time.LocalDate;

public class CreateItemGroupDTO {

    private int itemId;
    private int amount;
    private LocalDate shippingDate;

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
        return "CreateItemGroupDTO{" +
                "itemId=" + itemId +
                ", amount=" + amount +
                ", shippingDate=" + shippingDate +
                '}';
    }
}
