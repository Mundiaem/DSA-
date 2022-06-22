import Arrays.Matrix.MatrixArray;
import Arrays.Matrix.MatrixRotate;
import BST.BinarySearchTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] results = new SearchItemX().qualifiedStudents();
        // System.out.println(Arrays.toString(results));
//        int[] results= new SearchItemX().qualifiedStudents();
//        System.out.println(Arrays.toString(results));
        ;
/*
                System.out.printf("%s > exist \n", r);
*/
        // MatrixArray.matrix();
        // MatrixArray.printMatrixInOrder();
        //MatrixArray.matrixSpiralRecursive();

        //MatrixRotate.rotatingMatrix();
        MatrixRotate.rotateBy180Degrees();

    }

    private static void bst() {
        int[] arrayOne = {83, 54, 17, 46, 72, 31, 23, 55, 63, 49, 40, 21, 95, 36, 81, 39, 28, 79, 32, 72, 39, 10, 47, 94, 83, 74, 6, 53, 36, 94, 13, 30, 12, 62, 31, 16, 36, 66, 26, 29, 86, 55, 88, 40, 1, 0, 94, 38, 94, 9};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.plantBinaryTree(arrayOne);
        List<Integer> results = new ArrayList<>();
        binarySearchTree.inOrderTransversal(binarySearchTree.getRoot());
        int[] arrayTwo = {38, 16, 98, 48, 10, 76, 59, 26, 24, 27, 88, 99, 39, 45, 89, 23, 76, 46, 86, 51, 5, 58, 74, 40, 42, 36, 20, 81, 13, 94, 13, 60, 27, 1, 0, 24, 98, 82, 70, 93, 26, 64, 73, 83, 4, 31, 20, 0, 57, 40, 40, 19, 49, 2, 39, 6, 39, 69, 93, 72, 78, 90, 14, 88, 45, 78, 54, 54, 55, 79};
        for (int r : arrayTwo)
            if (binarySearchTree.isLeafValueAvailable(binarySearchTree.getRoot(), r)) results.add(r);
    }

    private static void hashM() {
        // Map is an interface and HashMap is a class that implements Map
        // linkedHashMap> maintains the order of insertion
        // Hashmap does not maintain the order
        //
        Map<String,String> hashMap= new HashMap<>();
        Map<String, String>link= new LinkedHashMap<>();
        // list > author - numbers of books> int
        // o> {'author': 10}, {'author': 10}
        // Author > author_name , no_of_book
        // List<Author> listBooks= new ArrayList<>();
        // quickSort > quickSort(List<Author>listAuthor)
        // convert >| array
        // problem > loss the order of the data
        // > keys should be unique
        // Map<String, Integer> mapAuthor= new LinkedHashMap<>();
        // for(Author a: listAuthor){
        // mapAuthor.put(a.author_name, a.no_of_book);
        // }
        /*
        1. use the list
        2. use inbuilt methods to sort the list objects
        3. implements interfaces to sort the objects
          a. comparator

        * */



    }


}
