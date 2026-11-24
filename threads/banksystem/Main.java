package threads.banksystem;

public class Main {
    public static void main(String[] args)throws Exception {
        Bank bank=new Bank();
        Phonepay pay=new Phonepay(bank,"withdraw",500);
        
        ATM atm=new ATM(bank,"withdraw",1000);
        Phonepay pay2=new Phonepay(bank,"deposite",5000 );
        
        pay.join(100);
        pay.start();
        pay2.join(100);
        pay2.start();
        atm.join(100);
        atm.start();

        Thread.sleep(1000);

        bank.getBal();
        

    }

}
