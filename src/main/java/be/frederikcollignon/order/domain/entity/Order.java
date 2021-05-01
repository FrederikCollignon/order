package be.frederikcollignon.order.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @SequenceGenerator(name = "orders_seq", sequenceName = "orders_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_seq")
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
}
