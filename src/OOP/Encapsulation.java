package OOP;

// BankAccount class with Encapsulation
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000);
        account.displayAccount();
        
        // Depositing money
        account.deposit(500);
        
        // Display updated balance
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}
