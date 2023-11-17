import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 
        ;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            return true;
        } else {
            return false;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }
}

public class OnlineBanking {
    public static void main(String[] args) {
    
        BankAccount userAccount = new BankAccount("123456789", "1234", 1000.0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (userAccount.validatePin(enteredPin)) {
            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();

            if (userAccount.withdraw(withdrawalAmount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }

            userAccount.displayAccountInfo();
        } else {
            System.out.println("Invalid PIN. Withdrawal canceled.");
        }

        scanner.close();
    }
}
