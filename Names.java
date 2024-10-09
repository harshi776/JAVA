public class MethodOverloadingExample {
    public int sum(int a, int b) {
        return a + b;
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public String sum(String a, String b) {
        return a + b;
    }

    public void print(int a) {
        System.out.println("Integer: " + a);
    }
    public void print(String b) {
        System.out.println("String: " + b);
    }

    // This method prints a double
    public void print(double c) {
        System.out.println("Double: " + c);
    }

    public double area(double radius) {
        return Math.PI * radius * radius; // Area formula: πr²
    }
    public double area(double length, double width) {
        return length * width; // Area formula: length * width
    }
    public double area(double base, double height, boolean isTriangle) {
        return (base * height) / 2; // Area formula: (base * height) / 2
    }

    public int sumVarArgs(int... numbers) {
        int sum = 0; // Initialize sum
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
    
        MethodOverloadingExample example = new MethodOverloadingExample();

        System.out.println("Sum of integers: " + example.sum(10, 20)); 
        System.out.println("Sum of doubles: " + example.sum(10.5, 20.5)); 
        System.out.println("Sum of strings: " + example.sum("Hello, ", "World!")); 

        example.print(100); 
        example.print("Hello"); 
        example.print(99.99); 

        System.out.println("Area of Circle: " + example.area(5.0)); 
        System.out.println("Area of Rectangle: " + example.area(5.0, 10.0)); 
        System.out.println("Area of Triangle: " + example.area(5.0, 10.0, true)); 
        System.out.println("Sum of variable arguments: " + example.sumVarArgs(1, 2, 3, 4, 5)); 
    }
}
