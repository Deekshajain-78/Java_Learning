
package threads.banksystem;

public class ATM extends Thread {
    Bank bank;
    String op;
    int amount;

    ATM(Bank bank, String op, int amount) {
        this.bank = bank;
        this.op = op;
        this.amount = amount;
    }

    public void disp() {
        if (op.equals("withdraw")) {
            try {
                bank.withdraw(amount);
                bank.getBal();
            } catch (BankException e) {
                System.out.println(e.getMessage());
            }
        }
        else if (op.equals("deposite")) {
            bank.deposite(amount);
        }
        else if (op.equals("balance")) {
            bank.getBal();
        }
        else {
            System.out.println("wrong option");
        }
    }

    @Override
    public void run() {
        disp();
    }
}
