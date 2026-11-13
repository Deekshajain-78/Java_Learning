package encapsulation;

public class Bank {
    private int balance=2000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        System.out.println(amount+ " amount is withdraw successfully");
        balance=balance-amount;
    }
    public void deposite(int amount){
        System.out.println(amount+ "amopunt is credited");
        balance=balance+amount;

    }

}
