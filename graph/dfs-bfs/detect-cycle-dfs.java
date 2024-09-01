class Solution {
    // Function to detect cycle in an undirected graph.
    boolean isCycle(int u, ArrayList<ArrayList<Integer>> graph, boolean[] visited, int parent){
        visited[u]=true;
        
        for(int v: graph.get(u)){
             if(visited[v] == false){
                    if(isCycle(v, graph, visited, u))
                        return true;
                }
                else if( v != parent)
                        return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            
            boolean[] visited  = new boolean[V];
            
            for(int i=0; i<V; i++){
                
                if(visited[i] == false)
                if(isCycle(i, adj, visited, -1)){
                    return true;
                }
            }
            
            return false;
    }   
    
}
