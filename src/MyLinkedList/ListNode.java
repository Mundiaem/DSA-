package MyLinkedList;

/**
 * created with love by mundiaem
 * created on 22/11/2022
 * Time: 21:35
 * ⚡  - DSA-
 */

public class ListNode<T> {
    Node<T> head;
    //https://tenderleo.gitbooks.io/leetcode-solutions-/content/GoogleMedium/279.html
    //https://www.enjoyalgorithms.com/blog/swap-list-nodes-in-pairs



    Node<T> push(T data) {
        Node<T> newNode = new Node<T>(data);
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
        return head;

    }

    public Node<T> addFirst(T t) {
        Node<T> newHead = new Node<>(t);
        newHead.next = head;
        head = newHead;
        return head;
    }
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
    //https://leetcode.com/problems/reverse-nodes-in-k-group/
    //https://leetcode.com/problems/swap-nodes-in-pairs/discuss/11046/My-simple-JAVA-solution-for-share



}
