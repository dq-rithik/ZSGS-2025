import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = new int[10][3];
        int[] rollNo = new int[10];
        int[] total = new int[10];
        double[] average = new double[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNo[i] = scanner.nextInt();

            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
                sum += marks[i][j];
            }

            total[i] = sum;
            average[i] = sum / 3.0;
            System.out.println();
        }

        System.out.printf("%-10s %-12s %-10s%n", "Roll No", "Total Marks", "Average");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12d %-10.2f%n", rollNo[i], total[i], average[i]);
        }
        scanner.close();
    }
}
