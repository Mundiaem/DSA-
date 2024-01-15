package Graph;

import java.util.*;

public class CourseSchedule {
    public static void main(String[] args) {
       int  numCourses = 2;
       int [][] prerequisites = new int[][]{{1,0}};
       int  numCourses1 = 2; int [][] prerequisites1 = {{1,0}, {0,1}};
        System.out.println(canTake(numCourses, prerequisites));
        System.out.println(canTake(numCourses1, prerequisites1));

    }

    private static  boolean canTake(int numOfCourses, int [][] prerequisites ){

        // declare adjacent list
        List<List<Integer>> adj= new ArrayList<>();
        // create a variable for the in degree to store count for the number of in degree values
        int [] inDegree= new int[numOfCourses];
        //initialize adj list
        for(int i=0; i<numOfCourses; i++){
            adj.add(new ArrayList<>());
        }
        // initialize the adj list with the values each node
        for (int [] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }
        // declare the Queue for sorting the courses
        Queue<Integer> queue= new LinkedList<>();
        for (int i=0; i<numOfCourses; i++){
            //add the node with zero in degree, i.e no prerequisite
            if(inDegree[i]==0){
                queue.add(i);
            }
        }


        int numberOfNodeVisited=0;
        while (!queue.isEmpty()){
            int node = queue.poll();
            numberOfNodeVisited++;

            for (int it: adj.get(node)){
              inDegree[it]--;
              if(inDegree[it]==0){
                  queue.add(it);
              }
            }
        }


    return numOfCourses == numberOfNodeVisited;

    }
}
