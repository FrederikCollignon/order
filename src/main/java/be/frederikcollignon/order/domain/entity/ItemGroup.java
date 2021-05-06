package be.frederikcollignon.order.domain.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "item_group")
public class ItemGroup {

    @Id
    @SequenceGenerator(name = "item_group_seq", sequenceName = "item_group_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_group_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "item_id")
    private int itemId;

    @Column(name = "amount")
    private int amount;

    @Column(name = "shipping_date")
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
