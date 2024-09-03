
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree = new int[V];
        for(int i=0; i<V; i++){
            for(int v: adj.get(i)){
                indegree[v]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        int[] ans = new int[V];
        int j=0;
        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                q.add(i);
                
            }
        }
        
        
        
        while(!q.isEmpty()){
                
                int u = q.poll();
                ans[j++] = u;
                
                for(int v: adj.get(u)){
                        
                       
                          indegree[v]--;
                        if(indegree[v] == 0)
                            q.add(v);
                        
                }
        }
        
        return ans;
    }
}
