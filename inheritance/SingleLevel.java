package inheritance;


class Employee {
    int id;
    String name;
    int salary;

    void disDetails() {
        System.out.println("Show Employee Details");
    }

    void calSalary() {
        System.out.println("Calculate the Salary");
    }
}

class Developer extends Employee {
    String language = "Java";

    void disDeveloperDetails() {
        super.disDetails();
        System.out.println("Developer Details");
        System.out.println("Programming Language: " + language);
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.disDetails();
        dev.calSalary();
        dev.disDeveloperDetails();
    }
}