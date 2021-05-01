package be.frederikcollignon.order.service.dto.response;

public class OrderDTO {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public OrderDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrderDTO setName(String name) {
        this.name = name;
        return this;
    }
}
