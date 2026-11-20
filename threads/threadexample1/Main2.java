
class A extends Thread {
    public void run() {
        try {
            for (int i = 100; i <= 200; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class Main2 {
    public static void main2(String[] args)
            throws InterruptedException {

        A a = new A();

        System.out.println(a.getState()); // NEW

        a.start();

        Thread.sleep(100);

        System.out.println(a.getState()); // Usually TIMED_WAITING or RUNNABLE

        a.join();

        System.out.println(a.getState()); // TERMINATED
    }
}
