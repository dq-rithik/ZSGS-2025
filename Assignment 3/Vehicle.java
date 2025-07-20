public class Vehicle {
    String vehicleId;
    String brand;
    double price;

    static int count = 0;

    Vehicle(String vehicleId, String brand, double price){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
        count += 1;
    }

    void displayInfo(){
        System.out.println("Vehicle ID : " + this.vehicleId);
        System.out.println("Vehicle Brand : " + this.brand);
        System.out.println("Vehicle Price : " + this.price);
        System.out.println("******************************");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("2101", "Audi A3", 2000000);
        Vehicle car1 = new Vehicle("2105", "Yellow Charger", 1200000);

        car.displayInfo();
        car1.displayInfo();
        System.out.println("Total count of Vehicles: " + Vehicle.count);
    }
}
