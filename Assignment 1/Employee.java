public class Employee {
    int employeeId;
    String name;
    String dept;
    double salary;

    public Employee(int employeeId, String name, String dept, double salary ){
        this.employeeId = employeeId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(201803, "Karthik", "Development", 55000);

        System.out.println(emp1.employeeId);
        System.out.println(emp1.name);
        System.out.println(emp1.dept);
        System.out.println(emp1.salary);
    }
}
