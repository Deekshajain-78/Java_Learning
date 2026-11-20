package threads.threadexample1;

//min
class A extends Thread{
    public void run(){
        for(int i=100;i<=200;i++){
            System.out.println(Thread.currentThread().getName());
        }        
    }
}

//nor
class B extends Thread{
    public void run(){
        for(int i=201;i<=300;i++){
            System.out.println(Thread.currentThread().getName());
        }
        
        
    }
}
//eme
class C extends Thread{
    public void run(){
        for(int i=301;i<=400;i++){
            System.out.println(Thread.currentThread().getName());
        
        }
    }
}


public class Main {
    public static void main(String[]args)throws InterruptedException{
        A a=new A();
        a.setPriority(Thread.MIN_PRIORITY);
        
        B b=new B();
        b.setPriority(Thread.MIN_PRIORITY);
        
        C c=new C();
        c.setPriority(Thread.MAX_PRIORITY);

        
            c.start();
            c.join();
            a.start();
            b.start();
    }

}
