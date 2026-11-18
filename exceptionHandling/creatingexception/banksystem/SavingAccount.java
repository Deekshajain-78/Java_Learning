package exceptionHandling.creatingexception.banksystem;

public class SavingAccount {
    int Balance=1000;

    void withdraw(int amount) throws BankException{
        if(amount>Balance){
            throw new BankException("Insuffient amount");
        }
        System.out.println(amount+"debited from your account");
        Balance-=amount;
    }
    void deposite(int amount){
        System.out.println(amount+"credited to your account");
        Balance+=amount;
    }
    void getBal(){
        System.out.println("balance="+Balance);
    }

}
