
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         ArrayList<Integer> bfsTraversal = new ArrayList<>(); 
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            bfsTraversal.add(currentNode);
            for (int neighbor : adj.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; 
                    queue.add(neighbor); 
                }
            }
        }
        return bfsTraversal;
    }
}