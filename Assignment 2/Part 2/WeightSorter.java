import java.util.Scanner;

public class WeightSorter {
    public static void main(String[] args) {
        double[] weights = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weights of 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Weight " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < weights.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[j] > weights[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                double temp = weights[i];
                weights[i] = weights[maxIndex];
                weights[maxIndex] = temp;
            }
        }

        System.out.println("\nWeights in descending order:");
        for (double weight : weights) {
            System.out.println(weight);
        }
        scanner.close();
    }
}
