package Assignment_01_ItemCostCalculator;

public class Assignment1 {
    public static void main(String[] args) {

        float itemPrice = 10.00f;
        int numOfItemsAvailable = 1000;
        float taxRate = 8.00f;
        float discountPercentage = 10.00f;

        int numOfItemsPurchased = 243;
        float subtotal = itemPrice * numOfItemsPurchased;
        float tax = subtotal * (taxRate/100);
        float discount = (subtotal * (discountPercentage/100));
        float total = subtotal + tax - discount;
        System.out.println("Subtotal cost: " + subtotal);
        System.out.println("Total tax: " + tax);
        System.out.println("Total discount: " + discount);
        System.out.println("Total total: " + total);

    }
}
