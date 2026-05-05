public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ali", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println(acc);
    }
}
