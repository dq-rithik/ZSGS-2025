public class ExplicitTypeCasting{
    public static void main(String[] args) {
        double myDouble = 45.78;

        int myInt = (int) myDouble;

        byte myByte = (byte) myInt;

        char myChar = (char) myInt;

        System.out.println("Original double value: " + myDouble);
        System.out.println("After casting to int: " + myInt);
        System.out.println("After casting to byte: " + myByte);
        System.out.println("After casting to char: " + myChar);
    }
}