package be.frederikcollignon.order.service.dto.response;

public class ItemDTO {

    private int id;
    private String name;
    private String description;
    private double price;
    private int amount;

    public int getId() {
        return id;
    }

    public ItemDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public ItemDTO setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ItemDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
