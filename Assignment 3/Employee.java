
public class Employee {
    
    String employeeName;
    int employeeId;
    String designation;
    double salary;

    Employee(){ // no argument constructor
        System.out.println("Object has been created");
    }

    Employee(String name, int empId, String designation, double salary){ //parameterized constructor
        this.employeeName = name;
        this.employeeId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee emp){ //copy constructor
        this.employeeName = emp.employeeName;
        this.employeeId = emp.employeeId;
        this.designation = emp.designation;
        this.salary = emp.salary;
    }

    void displayInfo(){ 
        System.out.println("Employee Name : " + this.employeeName);
        System.out.println("Employee Id : " + this.employeeId);
        System.out.println("Employee Designation : " + this.designation);
        System.out.println("Employee Salary : " + this.salary);
        System.out.println("*****************************");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(); 
        Employee employee1 = new Employee("Karthik", 201811, "Quality Assurance Engineer", 55000);
        Employee employee2 = new Employee(employee1);

        employee.displayInfo();
        employee1.displayInfo();
        employee2.displayInfo();
    }

}
