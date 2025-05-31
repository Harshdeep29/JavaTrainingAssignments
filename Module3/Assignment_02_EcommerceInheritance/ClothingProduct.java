package Assignment_02_EcommerceInheritance;

public class ClothingProduct extends Product{
    private String fabric;
    private String size;
    ClothingProduct(String name, double price, String productId,String fabric, String size){
        super(name,price,productId);
        this.fabric = fabric;
        this.size = size;
    }
    public double calculateDiscount(){
        return price * 0.20;
    }
    public void printProduct(){
        System.out.println("Name: "+ super.name);
        System.out.println("Price: "+ super.price);
        System.out.println("ProductId: "+ super.productId);
        System.out.println("Fabric: "+ this.fabric);
        System.out.println("Size: "+ this.size);
    }
}
