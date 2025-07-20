public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProducts() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name      : " + name);
        System.out.println("Price     : $" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("*************************");
    }
}
