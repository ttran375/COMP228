package collections;

import java.util.Stack;

public class StEx {
    public static void main(String a[]) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Empty stack : " + stack);
        System.out.println("Empty stack : " + stack.isEmpty());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-Empty stack : " + stack);
        System.out.println("Non-Empty stack: Pop Operation : " + stack.pop());
        System.out.println("Non-Empty stack : After Pop Operation : " + stack);
        System.out.println("Non-Empty stack : search() Operation : " + stack.search(1002));
        System.out.println("Non-Empty stack : " + stack.isEmpty());
    }
}
