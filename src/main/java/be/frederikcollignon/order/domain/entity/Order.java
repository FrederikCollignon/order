package be.frederikcollignon.order.domain.entity;

public class Order {

    private Integer id;
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
