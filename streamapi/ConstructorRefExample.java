
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

;

class Employee {

    int id;
    String names;

    Employee() {

    }

    public Employee(String names) {
        this.names = names;
    }

    public String toString() {
        return "names=" + names;
    }

    public class ConstructorRefExample {

        @Override
        public String toString() {
            return "ConstructorRefExample []";
        }

        public static void main(String[] args) {
            List<Employee> empList = new ArrayList<>();
            List<String> names = Arrays.asList("Darshan", "Sammed", "Ayush", "Paddu", "Anush", "Dhanush");

            for (String name : names) {
                empList.add(new Employee(name));

            }
            System.out.println(empList);

            List<Employee> empList2 = new ArrayList<>();
            System.out.println("Try with stream Map()");
            empList2 = names.stream().map(name -> new Employee(name)).toList();
            System.out.println(empList2);

            System.out.println("Construtor ref");
            List<Employee> empList3 = new ArrayList<>();
            empList3 = names.stream().map(Employee::new).toList();
            System.out.println(empList3);

        }

    }
}
