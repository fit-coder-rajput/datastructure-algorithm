
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            

            boolean[] visited = new boolean[V];
           
            for(int i=0; i<V; i++){
                if(visited[i] == false){
                    visited[i] = true;
            Queue<int[]> q = new ArrayDeque<>();
            q.offer(new int[]{i, -1});
            
            while(!q.isEmpty()){
                
                int[] node = q.poll();
                int u = node[0];
                int parent = node[1];
                
                for(int v: adj.get(u)){
                    
                    if(visited[v] == true && v!=parent) return true;
                    
                    if(visited[v] == false){
                        visited[v] = true;
                        q.offer(new int[]{v, u});
                    }
                }
                 }
                }
            }
            
            return false;
    }
}
