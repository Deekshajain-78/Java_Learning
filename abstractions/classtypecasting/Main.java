package abstractions.classtypecasting;

class A{
    void disp(){
        System.out.println("Hello");
    }
}
class B extends A{
    void show(){
        System.out.println("Bye");
    }
}

public class Main {
    public static void main(String[] args) {
    //upcasting
    //done by implicit and explicit
    B b=new B();
    A a = new B();
    a.disp();

// Downcasting 
//without upcasting we cant perforn downcasting
//done by explicit
A a2=new B();
B b2=(B)a2;
b2.show();
b2.disp();
}
}
