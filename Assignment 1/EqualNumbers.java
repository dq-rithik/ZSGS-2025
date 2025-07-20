public class EqualNumbers{
    public static void main(String[] args){
        int number1 = 211;
        int number2 = 211;

        int result = number1 - number2;

        switch (result) {
            case 0 -> System.out.println("Both are Equal");
        
            default -> System.out.println("Both are Not Equal");
        }
    }
}