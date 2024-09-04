// link: https://leetcode.com/problems/course-schedule-ii/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
int[] indegree = new int[numCourses];
        for(int[] e: prerequisites){
            graph.get(e[1]).add(e[0]);
            indegree[e[0]]++;
        }

        Queue<Integer> q = new ArrayDeque<>();

        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
    int[] ans = new int[numCourses];
    int j=0;
        while(!q.isEmpty()){
            int u = q.poll();
           ans[j++] = u;

            for(int v: graph.get(u)){
                indegree[v]--;

                if(indegree[v] == 0){
                    q.offer(v);
                }
            }
        }


        return j == numCourses? ans: new int[]{};
        
    }
}