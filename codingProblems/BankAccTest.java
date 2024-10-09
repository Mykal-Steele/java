/**
 * BankAccTest
 */
public class BankAccTest {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100, 500.00);
        b1.getBalance();
        System.out.println(b1.getBalance());
        b1.deposite(500);
        b1.withdraw(200);
        b1.getBalance();
        System.out.println(b1.getBalance());
        
    }
}