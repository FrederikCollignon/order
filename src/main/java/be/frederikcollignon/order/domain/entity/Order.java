package be.frederikcollignon.order.domain.entity;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "item_group_list")
    @OneToMany
    @JoinColumn(name = "a")
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
