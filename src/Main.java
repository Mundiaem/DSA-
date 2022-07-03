import BST.SearchItemX;
import string.ReverseString;
import string.ReverseWord;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] results = new SearchItemX().qualifiedStudents();
        // System.out.println(Arrays.toString(results));
//        int[] results= new BST.SearchItemX().qualifiedStudents();
//        System.out.println(Arrays.toString(results));
        ;
/*
                System.out.printf("%s > exist \n", r);
*/
        // MatrixArray.matrix();
        // MatrixArray.printMatrixInOrder();
        //MatrixArray.matrixSpiralRecursive();

        //MatrixRotate.rotatingMatrix();
        //MatrixRotate.rotateBy180Degrees();
        // MatrixRotate.rotate90Clockwise();
        //MatrixRotate.rotateMatrix90ClockwiseMethod2();
        //ArrayListClass.implementationOfArrayList();

        //ArrayListClass.implementationOfArrayList();
        //StringBufferStringBuilder.stringImplementation();
        //ReverseString.stringReverse();
        //VectorClass.vectorImplementation();
        // StackClass.stackImplementation();

        ReverseWord.reverseWord();

    }


    private static void hashM() {
        // Map is an interface and HashMap is a class that implements Map
        // linkedHashMap> maintains the order of insertion
        // Hashmap does not maintain the order
        //
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> link = new LinkedHashMap<>();
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
