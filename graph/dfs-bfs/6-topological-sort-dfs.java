

/*Complete the function below*/


class Solution
{
    static void toposort(int u, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Deque<Integer> stack){
        visited[u] = true;
        
        for(int v: adj.get(u)){
                
                if(visited[v] == false)
                    toposort(v, adj, visited, stack);
        }
        stack.push(u);
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[] visited = new boolean[V];
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                toposort(i, adj, visited, stack);
            }
        }
        
        int[] ans = new int[V];
        int i=0;
        while(!stack.isEmpty())
        {
            int val = stack.pop();
            ans[i++] = val;
        }
        
        return ans;
    }
}
