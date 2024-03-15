package bfs;

import java.util.*;
//https://leetcode.com/problems/leftmost-column-with-at-least-a-one/description/
public class NumberOfComponentsUGbfs {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        System.out.println(bfs(n, edges));
    }

    private static int bfs(int n, int[][] edges) {
        int number_of_connected_component = 0;
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }
        for (int[] nodes : edges) {
            adj.get(nodes[0]).add(nodes[1]);
            adj.get(nodes[1]).add(nodes[0]);
        }

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                number_of_connected_component++;
                q.add(i);

                while (!q.isEmpty()) {
                    int node = q.poll();
                    visited[node] = true;

                    for(int nextNode: adj.get(node)){
                        if(!visited[nextNode]){
                            q.add(nextNode);

                        }
                    }

                }


            }


        }
        return number_of_connected_component;


    }

}
