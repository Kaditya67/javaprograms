class Employee {
    // Employee Class Variables
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

// Default Constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

// Display Function
   public void displayInfo() {
    System.out.printf("%-10s%-15d%-10.2f%-20s%n", name, yearOfJoining, salary, address);
}


// Main Function
public class EmployeeInfo {
    public static void main(String[] args) {
        // Create instances of Employee
        Employee employee1 = new Employee("John", 2010, 60000.0, "123 Main St, City1");
        Employee employee2 = new Employee("Alice", 2015, 55000.0, "456 Elm St, City2");
        Employee employee3 = new Employee("Bob", 2018, 62000.0, "789 Oak St, City3");

        // Display information for each employee
        System.out.println("name  year of joining salary address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
