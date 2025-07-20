public class StaticBlock {
    public static void main(String[] args) {
        new Main();
    }

}
class Main {
    // initializer block
    {
        System.out.println("Initializer block executed");
    }

    // static block 
    static {
        System.out.println("Static block executed");
    }

    


}