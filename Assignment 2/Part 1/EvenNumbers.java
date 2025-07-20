public class EvenNumbers {
    public static void main(String[] args) {

        int end = 5;
        System.out.println(findEven(end));
        
    }

    public static int findEven(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                continue;
            }
            else{
                sum += i;
            }
        }
        return sum;
    }
}
