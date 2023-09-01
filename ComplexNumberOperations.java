import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Perform operations and display results
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum of the complex numbers:");
        sum.display();

        System.out.println("Difference of the complex numbers:");
        difference.display();

        System.out.println("Product of the complex numbers:");
        product.display();

        scanner.close();
    }
}
