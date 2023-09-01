import java.util.Scanner;

public class NumberOperations {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


// Test Armstrong Function
    public static boolean testArmstrong(int num) {
    if (num < 0) {
        return false; // Armstrong numbers are defined only for non-negative integers
    }

    int originalNum = num;
    int sum = 0;
    int numDigits = countDigits(num);

    while (num > 0) {
        int digit = num % 10;
        sum += Math.pow(digit, numDigits);
        num /= 10;
    }

    return sum == originalNum;
    }

// Helper method to count the number of digits in an integer
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }


// Test Palindrome Function
    public static boolean testPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum == originalNum;
    }

// Test Prime Function
    public static boolean testPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

// Print Fibonacci Series
    public static void fibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

// Main Function begins...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Infinite Loop
            System.out.println("\nMenu:");
            System.out.println("1. Factorial");
            System.out.println("2. Test Armstrong");
            System.out.println("3. Test Palindrome");
            System.out.println("4. Test Prime");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); // Read Choice

            switch (choice) {
                case 1: // Factorial
                    System.out.print("Enter a number: ");
                    int numFactorial = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(numFactorial));
                    break;
                case 2:// Test Armstrong
                    System.out.print("Enter a number: ");
                    int numArmstrong = scanner.nextInt();
                    System.out.println("Is Armstrong: " + testArmstrong(numArmstrong));
                    break;
                case 3: // Test Palindrome
                    System.out.print("Enter a number: ");
                    int numPalindrome = scanner.nextInt();
                    System.out.println("Is Palindrome: " + testPalindrome(numPalindrome));
                    break;
                case 4: // Test Prime
                    System.out.print("Enter a number: ");
                    int numPrime = scanner.nextInt();
                    System.out.println("Is Prime: " + testPrime(numPrime));
                    break;
                case 5: // Print Fibonacci Series
                    System.out.print("Enter the number of terms: ");
                    int numTerms = scanner.nextInt();
                    fibonacciSeries(numTerms);
                    break;
                case 6: // Exit Loop
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
