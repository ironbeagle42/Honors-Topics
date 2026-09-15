import java.util.ArrayList;

// Undirected graph: nodes 0..4, neighbors stored per node
ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();

public void graph() {
    for (int node = 0; node < 5; node++) {
        neighbors.add(new ArrayList<Integer>());
    }  
    // edge helper: add each endpoint to the other's list
}


public static void dfs(int node, ArrayList<ArrayList<Integer>> neighbors, boolean[] visited) {
    visited[node] = true;
    System.out.print(node + " ");
    for (int neighbor : neighbors.get(node)) {
        if (!visited[neighbor]) {
            dfs(neighbor, neighbors, visited);
        }
    }
}
