// Method Overriding
// runtime polymorphism
// dynamic polymorphism
// late binding

class Whatsapp {
    public void status() {
        System.out.println("Seeing status");
    }
    public void calls() {
        System.out.println("we can audio and video call");
    }
    public void msg() {
        System.out.println("We can text and share audio,video and images");
    }
}

class Whatsapp2 extends Whatsapp {
    public void status() {
        System.out.println("seeing status and reacting");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        Whatsapp whatsapp = new Whatsapp();
        whatsapp.status(); 

       
        whatsapp = new Whatsapp2(); 
        whatsapp.status(); 
        
        
    }
}
