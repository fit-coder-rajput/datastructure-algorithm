
// problem link: https://leetcode.com/problems/course-schedule/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] e: prerequisites){
            int u = e[0]; int v = e[1];
            graph.get(v).add(u);
            indegree[u]++;
        }


        Queue<Integer> q = new ArrayDeque<>();
        int count=0;
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                count++;
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();

            for(int v: graph.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.offer(v);
                    count++;
                }
            }
        }

      return count == numCourses;  
    }
}
