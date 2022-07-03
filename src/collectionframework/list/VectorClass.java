package collectionframework.list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * created with love by mundiaem
 * created on 02/07/2022
 * Time: 05:50
 * ⚡  - DSA-
 */

public class VectorClass {
    public static void vectorImplementation() {
        implementation();
    }

    private static void implementation() {
        int min = 10;
        int max = 100;
        List<Integer> vectorList = new Vector<>();
        for (int i = 0; i < 100; i++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            vectorList.add(random_int);

        }
        System.out.println(" Vector class implementation ");
        System.out.println(vectorList.toString());
        System.out.println(" Vectors sorting ");
        // Time Complexity
        // O(n*log(n))
        // Space Complexity

        Collections.sort(vectorList);
        System.out.println(vectorList.toString());




    }
}
