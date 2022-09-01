import java.time.LocalDate;

/**
 * This class simulates a bank business.
 */
public class Bank {
    /**
     * Executes the bank transactions.
     * @param args not used
     */
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        // Create an account with balance 0.
        BankAccount bobAccount = new BankAccount();

        // Create an account with balance 5000.
        BankAccount aliceAccount = new BankAccount(5000);

        // Withdraw 500 francs from Alice's account.
        aliceAccount.withdraw(500);

        // Deposit 500 francs in Bob's account.
        bobAccount.deposit(500);

        // Output the current account balances
        double aliceBalance = aliceAccount.getBalance();
        double bobBalance = bobAccount.getBalance();
        System.out.println("Alice balance: " + aliceBalance);
        System.out.println("Bob balance: " + bobBalance);
    }
}