package Assignment_02_EcommerceInheritance;

public class ElectronicsProduct extends Product {
    private int warrantyInMonths;
    public ElectronicsProduct(String name, double price, String productId,int warrantyInMonths) {
        super(name, price, productId);
        this.warrantyInMonths = warrantyInMonths;
    }
    public double calculateDiscount() {
        return price*10;
    }
    public void printProductDetails() {
        System.out.println("Name: "+ super.name);
        System.out.println("Price: "+ super.price);
        System.out.println("ProductId: "+ super.productId);
        System.out.println("Warranty in months: "+ warrantyInMonths);
    }
}
