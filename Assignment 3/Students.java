public class Students{
    String name;
    int roll_no;
    int phoneNumber;
    String address;

    public Students(String name, int rollNo, int phoneNumber, String address){
        this.name = name;
        this.roll_no = rollNo;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll No. : " + this.roll_no);
        System.out.println("Phone Number : " + this.phoneNumber);
        System.out.println("Address : " + this.address);
        System.out.println("***********************");
    }

    public static void main(String[] args) {
        Students sam = new Students("Sam", 21, 11111111, "Tenkasi");
        Students john = new Students("John", 22, 111111111, "Surandai");

        sam.displayInfo();
        john.displayInfo();


    }
}
