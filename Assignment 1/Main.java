public class Main {
    public static void main(String[] args){
        Student karthik = new Student("karthik",18);
        Student bhuvanesh = new Student("bhuvanesh", 11);
        
        bhuvanesh.displayAge(); //non-static method call
        karthik.displayAge();
        Student.displayStandard(); // static method call
    }
 
}
class Student{

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        static int standard = 10; //static variable
        static final int subjectCount = 5; //fianl variable
        String name; //instance variable or non-static variable
        int age;

        void displayAge(){
            String suffix = " years old"; //local variable
            System.out.println(this.name + " is " + this.age + suffix); 
        }

        static void displayStandard(){  
            System.out.println(standard + "th Standard");
        }

}

