package constructorexample;


class Person {
    int balance;
    String holdername;

    Person() {
        balance = 30000;
        holdername = "Sammed";
    }

    
    Person(int balance, String holdername) {
        this.balance = balance;
        this.holdername = holdername;
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.balance);
        System.out.println(p1.holdername);

        Person p2 = new Person(20000, "Raksha");
        System.out.println(p2.balance);
        System.out.println(p2.holdername);

        Person p3 = new Person();
        System.out.println(p3.balance);
        System.out.println(p3.holdername);
    }
}

