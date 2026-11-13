package constructorexample;
//non-parameterized constructor

class Employee{
    int id=2;
    String name="Deeksha";

     Employee( ){
        System.out.println("Hello constructor");
    }

    Employee(int id,String name){
        this.name=name;
        System.out.println("Hi constructor");
    }

}

public class Example1 {
    public static void main(String[] args) {
        Employee ref1=new Employee();
        System.out.println(ref1.name);

        Employee ref2=new Employee(12,"abc");
        System.out.println(ref2.name);

        Employee ref3= new Employee();
        System.out.println(ref3.name);
         
    }


}
