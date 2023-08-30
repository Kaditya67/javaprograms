import java.util.Scanner;

public class QuadraticRootcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
           
            System.out.println("Roots are Real");
        } else if (discriminant == 0) {
            
            System.out.println("Roots are real and equal ");
        } else {
            System.out.println("No real solutions.");
        }

        scanner.close();
    }
}
