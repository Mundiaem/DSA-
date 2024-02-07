package Graph;

import java.util.*;

/**
 * created with love by mundiaem
 * created on 17/09/2022
 * Time: 13:18
 * ⚡  - DSA-
 */
/*
* There are N courses, labelled from 1 to N.

We are given relations[i] = [X, Y], representing a prerequisite relationship between course X and course Y: course X has to be studied before course Y.

In one semester you can study any number of courses as long as you have studied all the prerequisites for the course you are studying.

Return the minimum number of semesters needed to study all courses.  If there is no way to study all the courses, return -1.

Example 1:
Input: N = 3, relations = [[1,3],[2,3]]
Output: 2
Explanation:
In the first semester, courses 1 and 2 are studied. In the second semester, course 3 is studied.

Example 2:
Input: N = 3, relations = [[1,2],[2,3],[3,1]]
Output: -1
Explanation:
No course can be studied because they depend on each other.

Note:
1 <= N <= 5000
1 <= relations.length <= 5000
relations[i][0] != relations[i][1]
There are no repeated relations in the input.
* https://wentao-shao.gitbook.io/leetcode/toposort/1136.parallel-courses
* https://www.geeksforgeeks.org/minimum-number-of-days-required-to-schedule-all-exams/
* https://www.geeksforgeeks.org/minimum-halls-required-for-class-scheduling/
* https://www.programcreek.com/2014/05/leetcode-course-schedule-java/
* https://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
* https://www.happycoders.eu/algorithms/shortest-path-algorithm-java/
* https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
* https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/
* https://jojozhuang.github.io/algorithm/data-structure-topological-sorting/
* https://www.interviewkickstart.com/learn/kahns-algorithm-topological-sorting
* https://zxi.mytechroad.com/blog/tag/topological-sort/
* */
public class ParallelCourse {


    private static int maxPathLength = Integer.MIN_VALUE;
    private static boolean hasCycle = false;

    public static void implementation() {
        int[][] courses = {{1, 3}, {2, 3}};
        int N = 3;
        System.out.println(" minimum number of semesters: topological sort + BFS : " + minimumNumberOfSemestersTopologicalSortBFS(courses, N));
        //System.out.println(" minimum number of semesters: DFS + Longest Path : " + minimumNoOfSemestersDFSLongestPath(N, courses));

    }

    private static int minimumNumberOfSemestersTopologicalSortBFS(int[][] courses, int n) {
        /*
        * Example 1:
        Input: N = 3, relations = [[1,3],[2,3]]
        Output: 2
        Explanation:
        In the first semester, courses 1 and 2 are studied. In the second semester, course 3 is studied.
        *
        * Example 2:
        Input: N = 3, relations = [[1,2],[2,3],[3,1]]
        Output: -1
        Explanation:
        No course can be studied because they depend on each other.
        *
        * Approach 1 Topological sort + BFS
        * use map to create courses with their prerequisite
        * ranks the courses
        * Check in-degree of the causes
        * Time Space Complexity
        * O(E+V)
        * Space Complexity
        * O(1)
        *
        * Approach 2 Depth First Search + Longest Path
        *
        * */
        int num_of_semesters = 0;
        // step 1 : create a map called the courses
        Map<Integer, List<Integer>> coursesPrerequisite = new HashMap<>();
       // an array called indegree[]
        int[] inDegree = new int[n + 1];
        for (int[] c : courses) {
            //[[1,3],[2,3]]
            coursesPrerequisite.computeIfAbsent(c[0], (lst -> new ArrayList<>())).add(c[1]);
          // calculate all the  indegree
            ++inDegree[c[1]];

        }
    // enqueue all vertices with a indegree 0
        Queue<Integer> g = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                System.out.println("in degree of 0 :  " + i);
                g.offer(i);// 1,2
            }
        }
        // while the queue is not empty repeat
        while (!g.isEmpty()) {
            for (int sz = g.size(); sz > 0; sz--) {
                // Dequeue the element at front from the queue
                int c = g.poll();
                --n;
                // if indegree[] exist in the graph map key continue
                if (!coursesPrerequisite.containsKey(c)) {
                    System.out.println("Does not contain:  " + c);
                    continue;
                }
                System.out.println(" queue :  " + c);
            // Dequeue the element at the front from the queue
            // and push it into the solution

                for (int course : coursesPrerequisite.remove(c)) {  // c's in-degree is currently 0, but it has no prerequisite
                   //Enqueue all vertices with  degree 0
                    if (--inDegree[course] == 0) { // decrease the in-degree of course's neighbors
                        g.offer(course);   // add current 0 in-degree vertex into Queue
                        System.out.println(" Offer " + course);
                    }
                    System.out.println("Out of Offer " + course);

                }

            }

            ++num_of_semesters; //need more semesters

        }


        return n == 0 ? num_of_semesters : -1;
    }

    private static int minimumNoOfSemestersDFSLongestPath(int N, int[][] relations) {

        Map<Integer, LinkedList<Integer>> courses=new HashMap<>();

        for(int[] relation: relations){
            courses.putIfAbsent(relation[0], new LinkedList<>());
            courses.get(relation[0]).add(relation[1]);
        }

        int[] depth = new int [N+1];

        boolean [] colors= new boolean[N+1];

        for (int i=1; i<=N; i++){
            dfs(i, colors, depth, courses);
        }
        return hasCycle ? -1:maxPathLength;

    }

    private static int dfs(int i, boolean[] colors, int[] depth, Map<Integer, LinkedList<Integer>> courses) {

        if (colors[i]) hasCycle=true;

        if (depth[i]>0||hasCycle) return depth[i];

        colors[i]=true;

        int max=0;

        // Find the longest path from the neighbor courses

        if (courses.containsKey(i)){
            for (int neighbor : courses.get(i)){
                max= Math.max(max, dfs(neighbor, colors, depth, courses));
            }
        }

        colors[i]= false;
        depth[i]= max+1;
        maxPathLength=Math.max(maxPathLength, depth[i]);
        return depth[i];

    }
    public static void main(String[] args) {
implementation();
    }
}


/*
* https://iq.opengenus.org/depth-first-search/
* https://iq.opengenus.org/topological-sorting-dfs/
* https://iq.opengenus.org/dfs-vs-bfs/
* https://www.hackerearth.com/practice/algorithms/graphs/topological-sort/tutorial/
* https://efficientcodeblog.wordpress.com/2017/11/28/topological-sort-dfs-bfs-and-dag/
* */