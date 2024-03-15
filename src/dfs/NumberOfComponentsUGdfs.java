package dfs;
//https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 323. Number of Connected Components in an Undirected Graph
 * <p>
 * Given n nodes labeled from 0 to n - 1 and a list ofundirected edges (each edge is a pair of nodes), write a function to find the number ofconnected components in an undirected graph.
 * Example 1:
 * Input: n = 5 and edges = [[0, 1], [1, 2], [3, 4]]
 * <p>
 * 0 3
 * | |
 * 1 --- 2 4
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * Input: n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]]
 * <p>
 * 0 4
 * | |
 * 1 --- 2 --- 3
 * <p>
 * Output:   1
 * <p>
 * Note:
 * You can assume that no duplicate edges will appear in edges . Since all edgesare undirected, [0, 1] is the same as [1, 0] and thus will notappear together in edges
 */
public class NumberOfComponentsUGdfs {
    public static void main(String[] args) {
        //Input: n = 5 and edges = [[0, 1], [1, 2], [3, 4]]
        int n= 5;
        int [][] edges = {{0, 1},{1, 2},{3, 4}};
        System.out.println(numberOfConnectedComponents(n, edges));

    }

    private static int numberOfConnectedComponents(int n, int[][] edges) {
        if (n <= 1) return n;

        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int number_of_connected_c = 0;


        boolean[] visited = new boolean[n];
        for (int edge = 0; edge < n; edge++) {
            if (!visited[edge]) {
                number_of_connected_c++;
                dfs(edge, adj, visited);
            }


        }
        return number_of_connected_c;
    }

    private static void dfs(int node, List<Set<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int nextNode : adj.get(node)) {
            if (!visited[nextNode]) {
                dfs(nextNode, adj, visited);

            }
        }

    }
}
