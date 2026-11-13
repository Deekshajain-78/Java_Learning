class Marks { 
    public static void add(int a) {
        System.out.println("marks are a = " + a);
    }
    
    public static void add(int a, int b) {
        System.out.println("marks are = " + (a + b));
    }
    
    public static void add(int a, int b, int c) {
        System.out.println("marks are = " + (a + b + c));
    }
}

class Senario {
    public static void main(String[] args) {
        Marks.add(90);        
        Marks.add(60, 70);     
        Marks.add(40, 80, 90);  
    }
}
