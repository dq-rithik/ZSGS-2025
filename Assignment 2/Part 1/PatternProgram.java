public class PatternProgram {

    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        return fact;
    }

    // Method to print Pascal's Triangle
    static void printPascalsTriangle(int rows) {
        int i = 0;
        do {
            // Print leading spaces
            int space = 1;
            do {
                if (space <= rows - i)
                    System.out.print(" ");
                space++;
            } while (space <= rows);

            int j = 0;
            do {
                int value = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(value + " ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }

    // Method to print the ZOHO pattern
    static void printZohoPattern() {
        String input = "ZOHO CORP ORAT IONS";
        String[] words = input.split(" ");
        int i = 0;
        do {
            System.out.println(words[i]);
            i++;
        } while (i < words.length);
    }

    public static void main(String[] args) {
        System.out.println("a) Pascal Triangle:");
        printPascalsTriangle(5);  // You can change the number of rows here

        System.out.println("ZOHO Pattern:");
        printZohoPattern();
    }
}
