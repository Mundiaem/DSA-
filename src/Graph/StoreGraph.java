package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreGraph {

    private static void storeGraph() {
        /*
         * Approach
         * Example
         * [[1,2],
         * [1,3],
         * [3,4],
         * [2,4]
         * [2,5]
         * [4,5]]
         * ===>
         * */
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] adjancencyMatrix = new int[n + 1][m + 1];
        for (int i = 0; i < m; i++) {
            int u, v;
            u = scanner.nextInt();
            v = scanner.nextInt();
            adjancencyMatrix[u][v] = 1;
            adjancencyMatrix[v][u] = 1;

        }
    }

    private static void storeAdjList() {
        /*
         *  Approach
         * 0 , 1 -> {2,3}, 2 -> {1,4,5},  3 -> {1,4}, 4 -> {2,3,5}, 5 -> {2,4}, > adjancency list
         *
         * */
        int n, m;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < m; i++) {



            //edge 1
            adjList.get(1).add(2);
            adjList.get(1).add(3);
            //edge 2
            adjList.get(2).add(1);
            adjList.get(2).add(4);
            adjList.get(2).add(5);
            //edge 3
            adjList.get(3).add(1);
            adjList.get(3).add(4);
            //edge 4
            adjList.get(4).add(2);
            adjList.get(4).add(3);
            adjList.get(4).add(5);
            //edge 5
            adjList.get(5).add(2);
            adjList.get(5).add(4);




        }
    }
}
