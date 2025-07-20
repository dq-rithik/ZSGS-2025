public class FibonacciArray {
    public static void main(String[] args) {
        int[] fibonacci = new int[30];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 30; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("First 30 Fibonacci numbers:");
        for (int i = 0; i < 30; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
