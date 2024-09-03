
class Solution {
    boolean dfsCycle(int u, ArrayList<ArrayList<Integer>> adj, boolean[] inrec ,  boolean[] visited){
        
        visited[u] = true;
        inrec[u] = true;
        
        for(int v: adj.get(u)){
                
                if(visited[v] == false){
                    if(dfsCycle(v, adj, inrec, visited))
                        return true;
                }else if(inrec[v] == true){
                    return true;
                }
        }
        inrec[u] = false;
        
        return false;
}
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        
        boolean[] visited = new boolean[V];
        boolean[] inrecurssion = new boolean[V];
        
        for(int i=0; i<V; i++){
                
                if(visited[i] == false && dfsCycle(i, adj, inrecurssion, visited)){
                    return true;
                }
        }
        
        return false;
    }
}