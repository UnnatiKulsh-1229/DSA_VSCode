import java.util.*;
class shortest_path{
    public int[] s_path(int[][]edges,int src){
        //making adj
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        int[] dist=new int[edges.length];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        q.add(src);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int e:adj.get(node)){
                if(dist[node]+1<dist[e]){
                    dist[e]=dist[node]+1;
                    q.add(e);
                }
            }
        }
        for(int i=0;i<edges.length;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source");
        int s=sc.nextInt();
        System.out.println("Enter verice numbers:");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        System.out.println("Enter edges");
        int[][] edges=new int[n][2];
        for(int i=0;i<n;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        shortest_path sp=new shortest_path();
        int[] res=sp.s_path(edges,s);
        System.out.println(Arrays.toString(res));
        //System.out.println();

    }
}