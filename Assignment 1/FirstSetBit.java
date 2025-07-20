public class FirstSetBit {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");

        int number = 100000;
        int remainder = 0;
        int current = number;

        while(current > 0) {
            remainder = current % 2;
            str.append(remainder); 
            current = current / 2;
            
        }


        if((str.charAt(0) == '0') && (str.charAt(1)=='0')){
            System.out.println("0");
        }
        else if((str.charAt(0) == '0') && (str.charAt(1)=='1')){
            System.out.println("1");
        }
        else if((str.charAt(0) == '1') && (str.charAt(1)=='0')){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }

        
    }
}
