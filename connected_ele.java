import java.util.*;

class node {
    int first;
    int second;

    node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class connected_ele {

    // BFS to mark visited nodes
    private void bfs(Queue<node> q, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        while (!q.isEmpty()) {
            node curr = q.peek();
            int n = curr.first;
            q.remove();

            for (int i : adj.get(n)) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(new node(i, n));
                }
            }
        }
    }

    public boolean is_connected(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] vis = new boolean[v + 1];

        Queue<node> q = new LinkedList<>();
        q.add(new node(1, -1));
        vis[1] = true;

        bfs(q, vis, adj);

        // Check if all nodes are visited
        for (int i = 1; i <= v; i++) {
            if (!vis[i]) return false;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int vu = sc.nextInt();

            adj.get(u).add(vu);
            adj.get(vu).add(u);
        }

        connected_ele c = new connected_ele();

        if (c.is_connected(adj, v)) {
            System.out.println("The graph is connected");
        } else {
            System.out.println("The graph is not connected");
        }
    }
}