public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 71;
        int originalNumber = number;

        if (number <= 0) {
            System.out.println(originalNumber + " is NOT a power of 2.");
            return;
        }

        while (number % 2 == 0) {
            number = number / 2;
        }

        if (number == 1) {
            System.out.println(originalNumber + " is a power of 2.");
        } else {
            System.out.println(originalNumber + " is NOT a power of 2.");
        }
    }
}
