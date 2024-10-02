public class Method {

    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int subtract(int a, int b) {
        return a - b;
    }

    
    public static int multiply(int a, int b) {
        return a * b;
    }


    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero error!");
            return 0;
        }
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 7. Print a string message
    public static void printMessage(String message) {
        System.out.println(message);
    }


    public static int square(int number) {
        return number * number;
    }

    
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        int sum = add(10, 5);
        System.out.println("Sum: " + sum);

        int difference = subtract(10, 5);
        System.out.println("Difference: " + difference);

        int product = multiply(10, 5);
        System.out.println("Product: " + product);

        double quotient = divide(10, 5);
        System.out.println("Quotient: " + quotient);

        boolean isEvenNumber = isEven(10);
        System.out.println("Is 10 even? " + isEvenNumber);

        int maxNumber = max(10, 5);
        System.out.println("Maximum: " + maxNumber);

        printMessage("This is a sample message!");

        int squareOfNumber = square(4);
        System.out.println("Square of 4: " + squareOfNumber);

        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);

        String reversed = reverseString("Java");
        System.out.println("Reversed string: " + reversed);
    }
}