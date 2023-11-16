import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 
        ;
    }

    // Method to perform a withdrawal
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            return true;
        } else {
            return false;
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to validate PIN
    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }
}

public class OnlineBanking {
    public static void main(String[] args) {
        // Example usage
        BankAccount userAccount = new BankAccount("123456789", "1234", 1000.0);

        // Simulate user input (replace this with actual user input code)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        // Validate PIN
        if (userAccount.validatePin(enteredPin)) {
            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();

            // Perform withdrawal
            if (userAccount.withdraw(withdrawalAmount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }

            // Display updated account information
            userAccount.displayAccountInfo();
        } else {
            System.out.println("Invalid PIN. Withdrawal canceled.");
        }

        scanner.close();
    }
}
