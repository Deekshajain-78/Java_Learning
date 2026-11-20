
package threads.runnableinterface;
class A implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
    }
}

interface d{
    void show();
}

interface e{
    void show();
}
//dimond problem
//when we want to extend 1 cls go to thread 
//when ever we want 
class C{
    public void show(){
    System.out.println("hello");
}
}
public class Main {
    public static void main(String[] args) {
        A a=new A();
        Runnable t1=new Thread(a);
        t1.run();
        a.run();
        B b=new B();
        Thread t2=new Thread(b);
        t2.start();
    }

}
