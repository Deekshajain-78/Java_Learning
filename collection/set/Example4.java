package collection.set;
interface A{
    void show();
    void disp();
}
interface B{
    int pay(int a,int b);
}
public class Example4 {
    public static void main(String[] args) {
        A a=new A(){
            public void show(){
                System.out.println("hello");
            }
            public void disp(){
                System.out.println("bye");
            }
        };
        B b=(a2,b2)-> a2+b2;
        int sum=b.pay(3,10);
        System.out.println(sum);
        
    }


}
