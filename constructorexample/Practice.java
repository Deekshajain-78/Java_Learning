package constructorexample;


class Student{
    String name="Bhoomika";
    int age=28;

    Student(){
        System.out.println("Hello, Good evening");
    }
    Student(String name,int age){
        this.name=name;
        System.out.println("Hey,Whatsup!!");
    }
}

public class Practice {
    public static void main(String[] args) {
        Student std=new Student();
        System.out.println(std.name);

        Student std1=new Student("pqr",45);
        System.out.println(std1.name);

        Student std2=new Student();
        System.out.println(std2.name);
    }

}
