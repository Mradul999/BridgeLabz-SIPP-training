public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

    public void displayDetails() {
        System.out.println("brand" + brand);
        System.out.println("model" + model);
        System.out.println("price:Rs" + price);

    }

    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone("Nothing", "2a", 22000);
        mobile.displayDetails();

    }

}
