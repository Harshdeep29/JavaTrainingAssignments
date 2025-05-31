package Assignment_02_EcommerceInheritance;

public class Main {
    public static void main(String[] args) {
        ClothingProduct shirt1 = new ClothingProduct("Check Shirt", 300,"SH32","Linen","S");
        ClothingProduct shirt2 = new ClothingProduct("Plain Shirt", 400,"SH10","Cotton","M");
        ElectronicsProduct m1 = new ElectronicsProduct("Note 8",15000.00,"MO21",24);
        ElectronicsProduct m2 = new ElectronicsProduct("Note 9",20000.00,"MO22",24);
        shirt1.printProduct();
        System.out.println("Price after discount is: "+shirt1.priceAfterDiscount()+"\n");
        shirt2.printProduct();
        System.out.println("Price after discount is: "+shirt2.priceAfterDiscount()+"\n");
        m1.printProductDetails();
        System.out.println("Price after discount is: "+m1.priceAfterDiscount()+"\n");
        m2.printProductDetails();
        System.out.println("Price after discount is: "+m2.priceAfterDiscount()+"\n");
    }
}
