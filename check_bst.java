//check is tree given is bst or not
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        left=right=null;
    }
}   
class check_bst{
    node root;
    boolean bst(node root,int min,int max){
        if(root==null) {
            //System.out.println("bst");
            return true;            
        }
        if(root.data<=min || root.data>=max) return false;
        return bst(root.left,min,root.data) && bst(root.right,root.data,max);
    }
    public static void main(String args[]){
        check_bst tree=new check_bst();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            tree.root=tree.insert(tree.root,val);
        }
        if(tree.bst(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE)) System.out.println("BST");
        else System.out.println("Not BST");


    }
    //bst order inserion
    public node insert(node root,int data){
        node newnode = new node(data);
    if(root == null)
        return newnode;
    Queue<node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        node temp = q.poll();
        if(temp.left == null){
            temp.left = newnode;
            break;
        }
        else q.add(temp.left);

        if(temp.right == null){
            temp.right = newnode;
            break;
        }
        else q.add(temp.right);
    }
    return root;
    }
}