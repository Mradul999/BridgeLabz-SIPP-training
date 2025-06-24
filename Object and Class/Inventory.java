public class Inventory {
    int itemCode;
    String itemName;
    double price;

    public Inventory(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalCost(int quantity) {
        return quantity * price;

    }

    public void displayDetails(int quantity) {
        System.out.println("itemCode" + itemCode);
        System.out.println("itemName" + itemName);
        System.out.println("price" + price);
        System.out.println("totalQuantity" + totalCost(quantity));

    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory(101, "soap", 100);
        inventory.displayDetails(10);
    }
}