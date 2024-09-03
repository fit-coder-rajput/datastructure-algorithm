

/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
       int[] indegree = new int[V];
       
       
       for(int i=0; i<V; i++){
           for(int v: adj.get(i))
            indegree[v]++;
       }
       int count = 0;
              Queue<Integer> q = new ArrayDeque<>();

       for(int i=0; i<V; i++){
           if(indegree[i] == 0) {
               count++;
               q.add(i);
           }
       }
       
       
       while(!q.isEmpty()){
            
            int u = q.poll();
            
        for( int v: adj.get(u)){
            indegree[v]--;
            
            if(indegree[v] == 0){
                q.add(v);
                count++;
            }
        }
       }
       
       return count != V;
    }
}