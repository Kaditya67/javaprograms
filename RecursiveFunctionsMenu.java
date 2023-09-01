import java.util.Scanner;

public class RecursiveFunctionsMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Recursive Functions Menu:");
            System.out.println("1. Find GCD and LCM");
            System.out.println("2. Print n Fibonacci numbers");
            System.out.println("3. Find reverse of a number");
            System.out.println("4. Solve 1 + 2 + 3 + ... + (n - 1) + n");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers to find GCD and LCM (space-separated): ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int gcd = findGCD(num1, num2);
                    int lcm = findLCM(num1, num2);
                    System.out.println("GCD: " + gcd);
                    System.out.println("LCM: " + lcm);
                    break;
                case 2:
                    System.out.print("Enter the value of 'n' to print Fibonacci numbers: ");
                    int n = scanner.nextInt();
                    System.out.println("Fibonacci Series (first " + n + " numbers):");
                    printFibonacci(n);
                    break;
                case 3:
                    System.out.print("Enter a number to find its reverse: ");
                    int number = scanner.nextInt();
                    int reversed = reverseNumber(number);
                    System.out.println("Reverse: " + reversed);
                    break;
                case 4:
                    System.out.print("Enter the value of 'n' to solve the sum: ");
                    int sumN = scanner.nextInt();
                    int result = solveSum(sumN);
                    if(sumN==1){
                        System.out.println("Sum of 1 is" +result);
                    }
                    else if(sumN==2){
                        System.out.println("Sum of 1 + 2 is"+ result);
                    }
                    else if(sumN==3){
                        System.out.println("Sum of 1 + 2 + 3 is"+ result);
                    }
                    else{
                        System.out.println("Sum of 1 + 2 + 3 + ... + " + sumN + " is " + result);
                    }
                    
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Recursive function to find GCD (Greatest Common Divisor)
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Recursive function to find LCM (Least Common Multiple)
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Recursive function to print n Fibonacci numbers
    public static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    

    // Recursive function to find reverse of a number
    public static int reverseNumber(int num) {
    return reverseNumberHelper(num, 0);
    }

    public static int reverseNumberHelper(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        reversed = (reversed * 10) + lastDigit;
        return reverseNumberHelper(remainingDigits, reversed);
    }


    // Recursive function to solve 1 + 2 + 3 + ... + (n - 1) + n
    public static int solveSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + solveSum(n - 1);
    }
}
