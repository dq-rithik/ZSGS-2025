public class Student {

    String name;
    int rollNumber ;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {

        Student student1 = new Student("John",2);
        
        System.out.println("Student name is : " + student1.name);
        System.out.println("Student roll number is : " + student1.rollNumber);

    }

}
