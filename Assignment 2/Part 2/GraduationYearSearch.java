import java.util.Scanner;
import java.util.Arrays;

public class GraduationYearSearch {

    static boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};

        Arrays.sort(years);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of graduation: ");
        int key = scanner.nextInt();

        boolean found = binarySearch(years, key);

        if (found) {
            System.out.println("record exists");
        } else {
            System.out.println("record does not exist");
        }
        scanner.close();
    }
}
