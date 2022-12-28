package MyLinkedList;

/**
 * created with love by mundiaem
 * created on 22/11/2022
 * Time: 17:27
 * ⚡  - DSA-
 */

public class SwapPairs<T> {


    public Node<T> solution(Node<T> head) {
        Node<Integer> myDummy = new Node<Integer>(0);
        myDummy.next = head;

        Node<Integer> current  = myDummy;

        while(current.next != null && current.next.next != null){
            //First node of the pair
            Node<Integer> first = current.next;
            // Second node of the pair
            Node<Integer> second = current.next.next;
            // Point the next of first node to the node after second node
            first.next= second.next;
            //Now the current node's next should be the second node
            current.next = second;
            //Linking the original second node to the first node
            current.next.next = first;
            //Move the pointer two nodes ahead
            current= current.next.next;
        }




        return myDummy.next;

    }
}
