
public class CheckInstance {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Karthik");

        if (emp instanceof Employee) {
            System.out.println("The object 'emp' is an instance of the Employee class.");
        } else {
            System.out.println("The object 'emp' is NOT an instance of the Employee class.");
        }
    }
}
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
