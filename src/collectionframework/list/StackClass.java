package collectionframework.list;

import java.util.Stack;

/**
 * created with love by mundiaem
 * created on 02/07/2022
 * Time: 06:56
 * ⚡  - DSA-
 */

public class StackClass {

    public static void stackImplementation() {
        implementation();
    }

    private static void implementation() {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("first");
        stringStack.push("second");
        stringStack.push("Third");
        stringStack.push("Fourth");
        stringStack.push("Fifth");
        stringStack.push("Sixth");
        System.out.println("Stack for String");
        System.out.println(stringStack.toString());
        System.out.println("Stack search fourth");
        System.out.println(stringStack.search("Third"));
        System.out.println("Stack get index 4");
        System.out.println(stringStack.get(4));
        System.out.println("Pop");
        stringStack.pop();


    }
}
