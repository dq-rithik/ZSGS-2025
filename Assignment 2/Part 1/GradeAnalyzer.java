public class GradeAnalyzer {
    public static void main(String[] args) {
        int percentage = 49;
        System.out.println(gradeAnalyzerUsingIf(percentage));
    }
    
    public static String gradeAnalyzerUsingIf(int percent){
        if(percent >= 85 && percent <= 100){
            return "A";
        }
        else if(percent >= 70){
            return "B";
        }
        else if(percent >= 50){
            return "C";
        }
        else{
            return "Fail";
        }
    }

    
}
