package ro.fasttrackit.curs9.curs9Homework;

public class Product {

    private int price;
    private String name;
    private String description;
    private int quantity;

    public Product(){}

    public Product(String name){
        this.name = name;
    }

    public Product(int price, String name){
        this.name = name;
        this.price = price;
    }

    public Product(int price, String name, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(int price, String name, String description, int quantity){
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
