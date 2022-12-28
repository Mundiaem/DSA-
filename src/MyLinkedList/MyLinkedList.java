package MyLinkedList;

/**
 * created with love by mundiaem
 * created on 23/11/2022
 * Time: 10:45
 * ⚡  - DSA-
 */

public class MyLinkedList {
    Node<Integer> head;

    public Node<Integer> implementation() {
        ListNode<Integer> listNode= new ListNode<Integer>();
        listNode.addFirst(1);
        listNode.addFirst(2);
        listNode.addFirst(3);
        listNode.addFirst(4);
        System.out.println(" ** Before Swapping **");

        print(listNode.head);
        SwapPairs<Integer> swapPairs= new SwapPairs<Integer>();
        System.out.println(" ** After Swapping **");
        print(swapPairs.solution(listNode.head));

        return listNode.head;


    }
    public void print(Node<Integer> myHead) {
        System.out.println("--------------------------------");
        Node<Integer> curr = myHead;
        while (curr!=null){
            System.out.println( curr.val +"  " );
            curr= curr.next;
        }}
}
