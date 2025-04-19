public class demo5 {
    private String accountNumber;
    private double balance;

    // Constructor
    public demo5(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " has balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        demo5 account = new demo5("123456789", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
    }
}
