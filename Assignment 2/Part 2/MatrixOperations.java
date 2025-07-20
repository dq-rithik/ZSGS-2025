import java.util.Scanner;

public class MatrixOperations {

    public static void inputMatrix(int[][] A, int m, int n, Scanner scanner) {
        System.out.println("Enter elements of matrix (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumMatrix(int[][] A, int m, int n) {
        int total = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                total += A[i][j];
        System.out.println("Sum of all elements: " + total);
    }

    public static void rowWiseSum(int[][] A, int m, int n) {
        System.out.println("Row-wise sums:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }
    }

    public static void colWiseSum(int[][] A, int m, int n) {
        System.out.println("Column-wise sums:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += A[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
    }

    public static void transposeMatrix(int[][] A, int m, int n) {
        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        int[][] A = new int[m][n];
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Input elements");
            System.out.println("2. Display matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose of matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> inputMatrix(A, m, n, scanner);
                case 2 -> displayMatrix(A, m, n);
                case 3 -> sumMatrix(A, m, n);
                case 4 -> rowWiseSum(A, m, n);
                case 5 -> colWiseSum(A, m, n);
                case 6 -> transposeMatrix(A, m, n);
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
