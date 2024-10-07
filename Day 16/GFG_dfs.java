class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsUtil(0, visited, result, adj);
        return result;
    }
     private void dfsUtil(int vertex, boolean[] visited, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> adj) {
        visited[vertex] = true;
        result.add(vertex);
        for (Integer neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited, result, adj);
            }
        }
    }
}