/**
 * A class to test the BankAccount class.
 */
public class BankAccountTester {
    /**
     * Tests the methods of the BankAccount class.
     * @param args not used
     */
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount(2000);
        bobAccount.deposit(1000);
        bobAccount.withdraw(500);
        System.out.println(bobAccount.getBalance());
        System.out.println("Expected: 2500");
    }
}
