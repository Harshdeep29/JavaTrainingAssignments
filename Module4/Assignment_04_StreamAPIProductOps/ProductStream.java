package Assignment_04_StreamAPIProductOps;

public class ProductStream {
    private String name;
    private String category;
    private double price;

    public ProductStream(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + category + "): ₹" + price;
    }
}
