import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions (length and breadth) of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Prompt the user to enter the length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Set the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
