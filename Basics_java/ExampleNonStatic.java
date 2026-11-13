

// class - Students - 
// non-static variable = id, name,marks,subject
// static varible = clgName
// non-static methods - showStudentDetails()
// static method - showClgname()
// print the details of student and clg in the main class

class student{
    int id=123;
    String name="Rakshitha";
    int marks=97;
    String subject="JAVA";
    static String clg="TNS";

    void StudentDetails(){
        System.out.println("Name:"+name );
         System.out.println("ID:" +id );
          System.out.println("Subject:" +subject );
        
    }
    void sclg(){
        System.out.println("clg name: " + student.clg);
    }
    
}
public class ExampleNonStatic {
    public static void main(String[] args) {
        
    
    student s=new student();
    s.StudentDetails();
    
    s.sclg();
}
}