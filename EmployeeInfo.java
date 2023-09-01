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
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Salary: Rs." + salary);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

// Main Function
public class EmployeeInfo {
    public static void main(String[] args) {
        // Create instances of Employee
        Employee employee1 = new Employee("John Smith", 2010, 60000.0, "123 Main St, City1");
        Employee employee2 = new Employee("Alice Johnson", 2015, 55000.0, "456 Elm St, City2");
        Employee employee3 = new Employee("Bob Brown", 2018, 62000.0, "789 Oak St, City3");

        // Display information for each employee
        System.out.println("Employee Information:");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
