package collection;
import java.util.ArrayList;
import java.util.Collections;
class Student1 implements Comparable<Student1>{	
	int id;
	String name;
	int marks;
	
	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
//	@Override
//	public int compareTo(Student1 o) {
//
//		return this.marks-o.marks;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
@Override
public int compareTo(Student1 o) {
	
	return this.name.compareTo(o.name );
}
}
public class Comprabledemo {
public static void main(String[] args) {
	ArrayList<Student1> s=new ArrayList<Student1>();
	
	s.add(new Student1(102,"sushma",27));
	s.add(new Student1(67,"guru",89));
	s.add(new Student1(15,"kavitha",90));
	s.add(new Student1(10,"rama",67));
	
	
	Collections.sort(s);
	System.out.println("after sorting by marks :");
	for(Student1 g:s) {
		System.out.println(g);
	}
	
}
}