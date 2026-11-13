package inheritance;

class Vehicle{
    void start(){
        System.out.println("vehicle will start");
    }
    void show(){
        System.out.println("Show the details of car");
    }
    void stop(){
        System.out.println("vehicle will stop");
    }
}
class BMWcar extends Vehicle{
    void strat(){
        super.start();
        System.out.println("car start with a music and opened roof");

    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        BMWcar v =new BMWcar();
        v.start();
        v.show();
        v.stop();
    }

}
