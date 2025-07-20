public class FindAddedLetter {
    public static char findTheDifference(String s, String t) {
        int charCodeSum = 0;
        for (char c : t.toCharArray()) {
            charCodeSum += c;
        }
        for (char c : s.toCharArray()) {
            charCodeSum -= c;
        }
        return (char) charCodeSum;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
    }
}
