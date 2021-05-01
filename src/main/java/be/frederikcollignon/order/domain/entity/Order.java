package be.frederikcollignon.order.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
