import java.util.Scanner;


public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter empno: ");

        int empNo = scanner.nextInt();


        System.out.print("Enter empname: ");

        scanner.nextLine();

        String empName = scanner.nextLine();


        System.out.print("Enter basic: ");


        double basic = scanner.nextDouble();


        double da = 0.7 * basic;

        double hra = 0.3 * basic;

        double cca = 240;

        double pf = 0.1 * basic;

        double pt = 100;


        double grossSalary = basic + da + hra + cca;

        double netSalary = grossSalary - pf - pt;


        System.out.println("Empno: " + empNo);

        System.out.println("Empname: " + empName);

        System.out.println("Gross Salary: " + grossSalary);

        System.out.println("Net Salary: " + netSalary);

    }

}
