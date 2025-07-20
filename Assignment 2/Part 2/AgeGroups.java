import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int[] ages = new int[10];
        int below18 = 0, between18And60 = 0, above60 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            if (ages[i] < 18) {
                below18++;
            } else if (ages[i] <= 60) {
                between18And60++;
            } else {
                above60++;
            }
        }
        scanner.close();

        System.out.println("Number of people below 18: " + below18);
        System.out.println("Number of people between 18 and 60: " + between18And60);
        System.out.println("Number of people above 60: " + above60);
    }
}
