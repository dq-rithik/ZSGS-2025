import java.util.Scanner;

public class PrimeNumbersFromInput {
    
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nPrime numbers are:");
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        scanner.close();
    }
}
