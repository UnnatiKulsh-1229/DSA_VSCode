// level order traversal of  tree using bfs
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class level_ord{
     private static node insert(node root, int data) {
        node newNode = new node(data);
        if (root == null) return newNode;
        Queue<node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            node temp = q.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                q.offer(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                q.offer(temp.right);
            }
        }
        return root;
    }

    private ArrayList<ArrayList<Integer>> level(node root){
        int lvl=0;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<node> q=new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            res.add(new ArrayList<>());
            int n=q.size();
            for(int i=0;i<n;i++){
                node no=q.poll();
                res.get(lvl).add(no.data);
                if(no.left!=null) q.offer(no.left);
                if(no.right!=null) q.offer(no.right);
            }

            lvl++;
        }
        return res;
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        node root=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            root=insert(root,data);   
            }
        level_ord obj=new level_ord();
        ArrayList<ArrayList<Integer>> res=obj.level(root);
        System.out.println("level order traversal:");
        for(ArrayList<Integer> i:res){
            for(int j:i){    
                System.out.print(j+" ");
            }
            System.out.println();
        }
}
}