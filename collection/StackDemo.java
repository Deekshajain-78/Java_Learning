package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Adding elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        System.out.println(s);

        // Checking whether Stack is empty
        s.empty();

        System.out.println(s);

        // Searching an element
        s.search(20);

        System.out.println(s);

        // Viewing the top element
        s.peek();

        System.out.println(s);

        // Removing the top element
        s.pop();

        System.out.println(s);

        // Printing elements
        for (int h : s) {
            System.out.println(h);
        }

        // Removing all elements
        s.clear();

        System.out.println(s);
    }
}
