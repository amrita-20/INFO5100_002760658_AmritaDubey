package structural_pattern.facade_method;

public class Product {
    private String name;
    private int id;
    private double price;

    public double getPrice() {
        return price;
    }

    Product(String name, int id, double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
