import java.util.*;

class find_cnt_tree {
    public static class node<T> {
        public T data;
        public node<T> left;
        public node<T> right;

        public node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void insert(node<Integer> root, node<Integer> newnode) {
        Queue<node<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            node<Integer> temp = q.poll();
            if (temp.left == null) {
                temp.left = newnode;
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = newnode;
                break;
            } else {
                q.add(temp.right);
            }
        }
    }
    public int solve(node<Integer> root, int sum) {
        if (root == null) return 0;
        int cnt = 0;
        if (root.data == sum) cnt++;
        cnt += solve(root.left, sum - root.data);
        cnt += solve(root.right, sum - root.data);
        return cnt;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        node<Integer> root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            node<Integer> newnode = new node<>(val);
            if (root == null) root = newnode;
            else insert(root, newnode);
        }
        int k = sc.nextInt();
        find_cnt_tree obj = new find_cnt_tree();
        int res = obj.solve(root, k);
        System.out.println(res);
    }
}