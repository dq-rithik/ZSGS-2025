public class Employeee {
    String name;
    int yearOfJoining;
    String address;

    public Employeee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInfo() {
        System.out.format("%-10s %-20d %-20s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
       
        Employeee emp1 = new Employeee("Robret", 1994, "64C-WallStreet");
        Employeee emp2 = new Employeee("Sam", 2000, "68D-WallStreet");
        Employeee emp3 = new Employeee("John", 1999, "26B-WallStreet");

        System.out.format("%-10s %-20s %-20s%n", "Name", "Year of joining", "Address");

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}