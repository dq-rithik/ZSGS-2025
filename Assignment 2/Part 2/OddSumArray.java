import java.util.Scanner;

public class OddSumArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sumOfOdds = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 != 0) {
                sumOfOdds += numbers[i];
            }
        }

        System.out.println("Sum of all odd numbers = " + sumOfOdds);

        scanner.close();
    }
}
