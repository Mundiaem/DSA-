package BST;

/**
 * created with love by mundiaem
 * created on 16/06/2022
 * Time: 13:42
 * ⚡  - DSA-
 */

public class BinarySearchTree {
    Node root = null;


    public BinarySearchTree() {

    }

    public Node addNodesRecursively(Node current, int item) {
        // adding the first node of bst
        // if the bst is empty
        if (current == null)
            return new Node(item);

// the leaf of the current node is greater than the item so add it on the left leaf/vertice
        //
        if (current.data > item)
            current.left = addNodesRecursively(current.left, item);
        // the current node leaf is less than the item so add on the right current leaf
        if (current.data < item)
            current.right = addNodesRecursively(current.right, item);
        if (current.data == item)
            current.left = addNodesRecursively(current.left, item);


        return current;


    }

    // adding student in into the binary tree
    public void plantBinaryTree(int[] bsl) {
        for (int s : bsl) {
            // initializing the root with the current state of the node
            //  pass the current state of the node as an argument for the adding nodes
            root = addNodesRecursively(root, s);
        }
    }

    public Node getRoot() {
        return root;
    }

    //test
    // start form left subtree> current node > right subtree
    // should return data in ascending order
    public void inOrderTransversal(Node current) {
        // return if the current node is null
        if (current == null)
            return;
        // start from the left subtree
        inOrderTransversal(current.left);
        // take the current node value
        System.out.println(" Node: " + current.data);
        // transverse to the right subtree last
        inOrderTransversal(current.right);

    }

    public boolean isLeafValueAvailable(Node current, int item) {
        if (current == null) {
            return false;
        }

        //exist in the current node
        if (current.data == item)
            return true;
        // exist in the  node of the left subtree
        if (isLeafValueAvailable(current.left, item))
            return true;
        if (isLeafValueAvailable(current.right, item))
            return true;

        return false;
    }


}
