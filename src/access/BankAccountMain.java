package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000); // 입금
        bankAccount.withdraw(3000); // 출금
        System.out.println("balance = " + bankAccount.getBalance()); // 잔고
    }
}
