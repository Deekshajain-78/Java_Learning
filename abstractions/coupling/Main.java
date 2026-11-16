package abstractions.coupling;

class Vehicle{
    void run(){
        System.out.println("runs on petrol");
    }
}
 class Car{
    void run(){
        Vehicle vehicle=new Vehicle();
        vehicle.run();
    }
 }
public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
    }

}
