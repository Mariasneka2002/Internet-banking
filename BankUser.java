 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankUser {
    private String username;
    private String password;
    private double balance;

    public BankUser(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}

class InternetBankingSystem {
    private Map<String, BankUser> users;

    public InternetBankingSystem() {
        this.users = new HashMap<>();
    }

    public void registerUser(String username, String password, double initialBalance) {
        BankUser newUser = new BankUser(username, password, initialBalance);
        users.put(username, newUser);
        System.out.println("User registered successfully.");
    }

    public BankUser loginUser(String username, String password) {
        BankUser user = users.get(username);
        if (user != null && user.authenticate(password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            return user;
        } else {
            System.out.println("Invalid username or password. Login failed.");
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InternetBankingSystem bankingSystem = new InternetBankingSystem();
        bankingSystem.registerUser("john_doe", "password123", 1000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        BankUser currentUser = bankingSystem.loginUser(username, password);

        if (currentUser != null) {
            // Simulate banking operations
            currentUser.deposit(500.0);
            currentUser.withdraw(200.0);
        }

        scanner.close();
    }
}