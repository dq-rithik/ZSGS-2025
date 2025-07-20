public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 4;
        System.out.println(decimalToBinary(decimal));
    }

    public static String decimalToBinary(int num){
        int remainder = 0;
        int current = num;
        StringBuilder binary = new StringBuilder("");

        while(current > 0){
            remainder = current % 2;
            current = current / 2;
            binary.append(remainder);
        }
        
        return binary.reverse().toString();
    }
}
