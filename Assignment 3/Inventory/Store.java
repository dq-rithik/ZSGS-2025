import java.util.ArrayList;
import java.util.List;

public class Store {
    private static String storeName;
    private static String storeLocation;
    private List<Product> products;

    Store() {
        products = new ArrayList<>();
    }

    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("*****************************");
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayAllProducts() {
        System.out.println("All Products in Store:");
        for (Product p : products) {
            p.displayProducts();
        }
    }
}
