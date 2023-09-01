import java.util.Scanner;

class BankAccount {
    // Class Variables
    private String customerName;
    private int accountNumber;
    private double balance;
    private double rateOfInterest;
    private String contactNumber;
    private String address;

    // Defult Constructor
    public BankAccount(String customerName, int accountNumber, double initialBalance, double rateOfInterest, String contactNumber, String address) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.rateOfInterest = rateOfInterest;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // Deposit Function
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }

    // Withdraw Function
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    // Compute Interest Function
    public void computeInterest() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest computed: Rs." + interest);
    }

    // Display Function
    public void displayBalance() {
        System.out.println("Account Balance: Rs." + balance);
    }
}

    // Main Function
public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAccounts = 10;
        BankAccount[] accounts = new BankAccount[maxAccounts];
        int accountCount = 0;

    // Infinite Loop
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); // Read Choice

            switch (choice) {
                case 1: // Create Account
                    if (accountCount < maxAccounts) {
                        scanner.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String customerName = scanner.nextLine();

                        System.out.print("Enter Account Number: ");
                        int accountNumber = scanner.nextInt();

                        System.out.print("Enter Initial Balance: ");
                        double initialBalance = scanner.nextDouble();

                        System.out.print("Enter Rate of Interest: ");
                        double rateOfInterest = scanner.nextDouble();

                        scanner.nextLine(); // Avoid Buffer
                        System.out.print("Enter Contact Number: ");
                        String contactNumber = scanner.nextLine();

                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();
                        
                        // Object Created
                        accounts[accountCount] = new BankAccount(customerName, accountNumber, initialBalance, rateOfInterest, contactNumber, address);
                        accountCount++;
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                case 2: // Deposit amount
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].accountNumber == accountNumber) {
                            accounts[i].deposit(depositAmount);
                            break;
                        }
                    }
                    break;
                case 3: // Withdraw Amount
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].accountNumber == accountNumber) {
                            accounts[i].withdraw(withdrawalAmount);
                            break;
                        }
                    }
                    break;
                case 4: // Compute Interest
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].accountNumber == accountNumber) {
                            accounts[i].computeInterest();
                            break;
                        }
                    }
                    break;
                case 5: // Display Balance
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].accountNumber == accountNumber) {
                            accounts[i].displayBalance();
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
