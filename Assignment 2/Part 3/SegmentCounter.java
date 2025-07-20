public class SegmentCounter {
    public static int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        String[] segments = s.split("\\s+");
        return segments.length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("Hello"));                 
        System.out.println(countSegments("   "));                   
        System.out.println(countSegments(""));                      
    }
}
