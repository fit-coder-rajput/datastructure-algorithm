// problem gfg: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    ArrayList<Integer> ans = new ArrayList<>();
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
       
        boolean[] visited = new boolean[V];
        dfs(0, adj, visited);
        return ans;
    }
    void dfs(int u, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[u] = true;
         ans.add(u);
         
         for(int v: adj.get(u)){
             if(visited[v] == false){
                 dfs(v, adj, visited);
             }
         }
    }
}
