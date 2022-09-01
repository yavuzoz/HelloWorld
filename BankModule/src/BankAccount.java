/**
 * This class models a simple bank account, allowing
 * money deposits and withdrawals.
 */
public class BankAccount {

        private double balance;

        /**
         * Constructs a bank account with a zero balance.
         */
        public BankAccount() {
                balance = 0;
        }

        /**
         * Constructs a bank account with a given balance.
         * @param initialBalance the account initial balance
         */
        public BankAccount(double initialBalance) {
                balance = initialBalance;
        }

        /**
         * Deposits the given amount in this account.
         * @param amount the amount to deposit
         */
        public void deposit(double amount) {
                balance = balance + amount;
        }

        /**
         * Withdraws the given amount from this account.
         * @param amount the amount to withdraw
         */
        public void withdraw(double amount) {
                balance = balance - amount;
        }

        /**
         * Returns current account balance.
         * @return the account balance
         */
        public double getBalance() {
                return balance;
        }
}