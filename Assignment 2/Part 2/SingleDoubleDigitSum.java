import java.util.Scanner;

public class SingleDoubleDigitSum {

    static void print(int x[], int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(x[i]);
            if (absVal < 10) {
                singleDigitSum += x[i];
            } else if (absVal >= 10 && absVal < 100) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println("Sum of single-digit elements = " + singleDigitSum);
        System.out.println("Sum of double-digit elements = " + doubleDigitSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " integer elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        print(arr, len);
        scanner.close();
    }
}
