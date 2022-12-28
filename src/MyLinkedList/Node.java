package MyLinkedList;

/**
 * created with love by mundiaem
 * created on 22/11/2022
 * Time: 17:25
 * ⚡  - DSA-
 */

public class Node<T> {

    Node next;
    T val;

    public Node(Node next, T val) {
        this.next = next;
        this.val = val;
    }

    public Node(T val) {
        this.val = val;
    }
}
