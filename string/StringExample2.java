package string;


public class StringExample2 {
    public static void main(String...args){
    //heap
/*1.const pool area
2.non-const pool area */

String name="abc";
System.out.println(name);

String name2=new String("abc");
String name4=new String("abc");
System.out.println(name2);
String name3="abc";

System.out.println(name==name2);
System.out.println(name.equals(name2));
System.out.println(name==name3);
System.out.println(name.equals(name3));
System.out.println(name2==name4);
    
}


}
