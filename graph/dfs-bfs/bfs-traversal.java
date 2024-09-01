class Solution {
    // Function to return Breadth First Traversal of given graph.
    
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            
            int u = q.poll();
            ans.add(u);
            
            for(int v: adj.get(u)){
                if(visited[v] == false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        return ans;
    }
}
