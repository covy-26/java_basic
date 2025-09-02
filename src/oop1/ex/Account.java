package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        this.balance += amount;
        System.out.println("입금: "+ amount);
        System.out.println("현재 잔고: "+ balance);
    }

    void withdraw(int amount){
        int reamin = balance - amount;
        System.out.println("출금: " + amount);
        if(reamin < 0){
            System.out.println("잔액 부족");
        }else {
            balance -= amount;
            System.out.println("현재 잔고: "+ balance);
        }

    }

    void showStatus(){
        System.out.println("현재 잔고: "+ balance);
    }
}
