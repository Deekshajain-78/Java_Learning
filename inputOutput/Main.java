package inputOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("age i ="+age);

        System.out.println("Enter two number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Sum of num1 and num2 ="+(num1+num2));
    }

}
