import java.util.*;

class lca {
    public static class node {
        int data;
        node left, right;
        public node(int data) {
            this.data = data;
            left = right = null;
        }
    }
        public static node insert(node root, node newnode) {
        if (root == null) return newnode;
        if (newnode.data < root.data)
            root.left = insert(root.left, newnode);
        else
            root.right = insert(root.right, newnode);
        return root;
    }
    public static node find(node root, int val) {
        if (root == null) return null;
        if (root.data == val) return root;
        if (val < root.data) return find(root.left, val);
        else return find(root.right, val);
    }
    public node lowestCommonAncestor(node root, node p, node q) {
        if (root == null) return null;
        if (p.data < root.data && q.data < root.data)
            return lowestCommonAncestor(root.left, p, q);
        else if (p.data > root.data && q.data > root.data)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        node root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, new node(val));
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        node p = find(root, a);
        node q = find(root, b);
        lca obj = new lca();
        node res = obj.lowestCommonAncestor(root, p, q);
        System.out.println(res.data);
    }
}