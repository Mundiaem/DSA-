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


    public static void implementation() {
        int[][] courses = {{1, 3}, {2, 3}};
        int N=3;
        System.out.println(" minimum number of semesters: "+ minimumNumberOfSemestersTopologicalSortBFS(courses, N))  ;
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
        * Approach 1 Topological sort BFS
        * use map to create courses with their prerequisite
        * ranks the courses
        * Check indegree of the causes
        *
        * */
        int num_of_semesters = 0;
        Map<Integer, List<Integer>> coursesPrerequisite = new HashMap<>();
        int [] inDegree = new int[n+1];
        for (int[] c: courses) {
            coursesPrerequisite.computeIfAbsent(c[0], (lst -> new ArrayList<>())).add(c[1]);
            ++inDegree[c[1]];

        }

        Queue<Integer> g= new LinkedList<>();
        for (int i=1; i<=n; i++){
            if(inDegree[i]==0){
                g.offer(i);
            }
        }
while (!g.isEmpty()){
    for (int sz= g.size(); sz>0; sz--){
        int c = g.poll();
        --n;
        if(!coursesPrerequisite.containsKey(c)){
            continue;
        }
        for (int course: coursesPrerequisite.remove(c)){  // c's in-degree is currently 0, but it has no prerequsite
            if (--inDegree[course]==0){ // decrease the in-degree of course's neighbors
                g.offer(course);   // add current 0 in-degree vertex into Queue
            }
        }

    }
    ++num_of_semesters; //need more semesters

}



        return n == 0 ? num_of_semesters :-1;
    }
}
