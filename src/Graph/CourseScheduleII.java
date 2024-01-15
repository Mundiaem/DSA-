package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int numCourses1 = 4;
        int[][] prerequisites1 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int numCourses2 = 1;
        int[][] prerequisites2 = {{0}};
        System.out.println(courseSchedule(numCourses, prerequisites));
        System.out.println(courseSchedule(numCourses1, prerequisites1));
        System.out.println(courseSchedule(numCourses2, prerequisites2));

    }

    private static List<Integer> courseSchedule(int numOfCourse, int[][] prerequisites) {
        /**
         * input numOfCourse=2; int [][] prerequisites ={{0, 1}};
         * in the courses above you must take course 1 before taking course 0
         * in the insight course 1 is the prerequisite of course 0 thus the
         * output = [1,0]
         *
         *
         * */
        List<Integer> schedule= new ArrayList<>();
        if(numOfCourse==1){
            schedule.add(0);
            return schedule;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<numOfCourse; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree= new int[numOfCourse];

        for(int[] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }

        Queue<Integer> queue= new LinkedList<>();

        for(int i=0; i<numOfCourse; i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int node = queue.poll();

            schedule.add(node);

            for (int it: adj.get(node)){
                inDegree[it]--;
                if (inDegree[it]==0){
                    queue.add(it);
                }
            }


        }

     return schedule.size()==numOfCourse ? schedule : new ArrayList<>();
    }
}
