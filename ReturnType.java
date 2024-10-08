public class ReturnType {

    public static void main(String[] args) {
        boolean returnedValue = checkZero();
        System.out.println("Returned value from checkZero: " + returnedValue);

        byte byteValue = getByteValue();
        System.out.println("Returned byte value: " + byteValue);

        int intValue = getIntValue();
        System.out.println("Returned int value: " + intValue);

        double doubleValue = getDoubleValue();
        System.out.println("Returned double value: " + doubleValue);

        float floatValue = getFloatValue();
        System.out.println("Returned float value: " + floatValue);

        long longValue = getLongValue();
        System.out.println("Returned long value: " + longValue);

        char charValue = getCharValue();
        System.out.println("Returned char value: " + charValue);

        String stringValue = getStringValue();
        System.out.println("Returned string value: " + stringValue);
    }

    
    public static byte getByteValue() {
        System.out.println("Declaring a byte value");
        byte value = 10;
        System.out.println("Returning a byte value");
        return value;
    }
    public static boolean checkZero() {
        int value = 1;
        System.out.println("Checking if value is zero");
        if (value == 0) {
            return true;
        }
        return false;
    }
    public static int getIntValue() {
        System.out.println("Declaring an int value");
        int value = 42;
        System.out.println("Returning an int value");
        return value;
    }
    public static double getDoubleValue() {
        System.out.println("Declaring a double value");
        double value = 99.99;
        System.out.println("Returning a double value");
        return value;
    }
    public static float getFloatValue() {
        System.out.println("Declaring a float value");
        float value = 10.5f;
        System.out.println("Returning a float value");
        return value;
    }
    public static long getLongValue() {
        System.out.println("Declaring a long value");
        long value = 100000L;
        System.out.println("Returning a long value");
        return value;
    }
    public static char getCharValue() {
        System.out.println("Declaring a char value");
        char value = 'A';
        System.out.println("Returning a char value");
        return value;
    }
    public static String getStringValue() {
        System.out.println("Declaring a string value");
        String value = "Hello, World!";
        System.out.println("Returning a string value");
        return value;
    }
}
