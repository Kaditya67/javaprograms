import java.util.Scanner;

public class MethodOverloading {

    // Method 1: Overloading with different number of parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Method 2: Overloading with different data types
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method 3: Overloading with different order of parameters
    public String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    public String concatenate(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    // Method 4: Overloading with different return types (not recommended)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        Scanner scanner = new Scanner(System.in);

        // Method 1: Overloading with different number of parameters
        System.out.println("Method 1:");
        System.out.print("Enter two integers (space-separated): ");
        int intInput1 = scanner.nextInt();
        int intInput2 = scanner.nextInt();
        System.out.println("Add integers: " + obj.add(intInput1, intInput2));

        System.out.print("Enter two doubles (space-separated): ");
        double doubleInput1 = scanner.nextDouble();
        double doubleInput2 = scanner.nextDouble();
        System.out.println("Add doubles: " + obj.add(doubleInput1, doubleInput2));

        // Method 2: Overloading with different data types
        System.out.println("\nMethod 2:");
        System.out.print("Enter three integers (space-separated): ");
        int intInput3 = scanner.nextInt();
        intInput1 = scanner.nextInt();
        intInput2 = scanner.nextInt();
        System.out.println("Add integers: " + obj.add(intInput1, intInput2, intInput3));

        System.out.print("Enter three doubles (space-separated): ");
        double doubleInput3 = scanner.nextDouble();
        doubleInput1 = scanner.nextDouble();
        doubleInput2 = scanner.nextDouble();
        System.out.println("Add doubles: " + obj.add(doubleInput1, doubleInput2, doubleInput3));

        // Method 3: Overloading with different order of parameters
        System.out.println("\nMethod 3:");
        System.out.print("Enter two strings (space-separated): ");
        String stringInput1 = scanner.next();
        String stringInput2 = scanner.next();
        System.out.println("Concatenate strings: " + obj.concatenate(stringInput1, stringInput2));

        System.out.print("Enter three strings (space-separated): ");
        String stringInput3 = scanner.next();
        stringInput1 = scanner.next();
        stringInput2 = scanner.next();
        System.out.println("Concatenate strings: " + obj.concatenate(stringInput1, stringInput2, stringInput3));

        // Method 4: Overloading with different return types (not recommended)
        System.out.println("\nMethod 4:");
        System.out.print("Enter two integers (space-separated): ");
        intInput1 = scanner.nextInt();
        intInput2 = scanner.nextInt();
        System.out.println("Multiply integers: " + obj.multiply(intInput1, intInput2));

        System.out.print("Enter two doubles (space-separated): ");
        doubleInput1 = scanner.nextDouble();
        doubleInput2 = scanner.nextDouble();
        System.out.println("Multiply doubles: " + obj.multiply(doubleInput1, doubleInput2));

        scanner.close();
    }
}
