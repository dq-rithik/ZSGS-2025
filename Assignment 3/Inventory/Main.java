public class Main {
    public static void main(String[] args) {
        
        Store.setStoreDetails("Karthik Electronics", "Tenkasi");

        Store store = new Store();

        Product p1 = new Product(101, "Keyboard", 49.99, 20);
        Product p2 = new Product(102, "Mouse", 29.99, 50);
        Product p3 = new Product(103, "Monitor", 199.99, 10);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
