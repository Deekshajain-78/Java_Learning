class Vehicle{
    public void phonepay(){
        System.out.println("pay using phonepay");
    }
    public void Gpay(){
        System.out.println("pay using Gpay");
    }
    public void paytm(){
        System.out.println("pay using paytm");
    }

}
class Vehicle2 extends Vehicle {
    public void phonepay() {
        System.out.println("transfer amt using phonepay");
    }
}

class Senario2{
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();
        vehicle.phonepay(); 

       
        vehicle = new Vehicle2(); 
        vehicle.phonepay(); 
        
    }     

}