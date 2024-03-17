class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        LinkedList<Integer>[] linkedLists = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            linkedLists[i] = new LinkedList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            linkedLists[u].add(v);
            linkedLists[v].add(u);
        }
        
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true; 
        
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (vertex == destination) {
                return true;
            }
            for (int adjacent : linkedLists[vertex]) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.offer(adjacent);
                }
            }
        }
        
        return false;
    }
}