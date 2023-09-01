import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    // Constructor with two parameters for name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with three parameters for name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store information for 10 students
        Student[] students = new Student[10];

        // Initialize student objects and set their information
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            // Prompt user for student information
            System.out.println("Enter information for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Address: ");
            String address = scanner.nextLine();

            // Set information using the appropriate setInfo method
            students[i].setInfo(name, age, address);
        }

        // Print the information of all students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Information:");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("Address: " + students[i].getAddress());
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
