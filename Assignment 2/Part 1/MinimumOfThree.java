public class MinimumOfThree{
    public static void main(String[] args){
        int number1 = 167;
        int number2 = 17;
        int number3 = 21;

        if(number1 < number2){
            if(number1 < number3){
                System.out.println(number1);
            }
            else{
                System.out.println(number3);
            }
        }
        else if(number2 < number3){
            System.out.println(number2);
        }
        else{
            System.out.println(number3);
        }



    }
}