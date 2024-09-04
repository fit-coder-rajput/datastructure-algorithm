class Solution {

    void dfs(int u, int[][] graph, boolean[] visited){
        visited[u] = true;

        for(int v=0; v<graph[u].length; v++){
            if(graph[u][v] == 1 && visited[v] == false){ // there is edge can visit v
                dfs(v, graph, visited);
            }
        }
    }

    void bfs(int src, int[][] graph, boolean[] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){

                int  u = q.poll();
                for(int v=0; v<graph[u].length; v++){
                    if(graph[u][v] == 1 && visited[v] == false){
                        visited[v] = true;
                        q.add(v);
                    }
                }
        }
    }
    public int findCircleNum(int[][] isConnected) {
            int V  =  isConnected.length;
            int prov = 0;
            boolean[] visited = new boolean[V];
            for(int i = 0; i<V; i++){

                if(visited[i] == false){
                    // dfs(i, isConnected, visited); // using dfs
                    bfs(i, isConnected, visited);  // using bfs
                    prov++;
                }
            }
            return prov;
    }
}