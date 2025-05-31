package Assignment_02_EcommerceInheritance;

public class Product {
    protected String name;
    protected double price;
    protected String productId;
    public Product(String name, double price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }
    public double getDiscount(){
        return price * 0.05;
    }
    public double priceAfterDiscount(){
        return price - getDiscount();
    }
}
