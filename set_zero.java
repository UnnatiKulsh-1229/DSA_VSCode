// Set matrix zero
import java.util.*;
class set_zero{
    static int[][] setmatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j==0) c=0;
                    else arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][0]==0|| arr[0][j]==0) arr[i][j]=0;
            }
        }
        if(arr[0][0]==0){
            for(int i=0;i<m;i++) arr[0][i]=0;
        }
        if(c==0){
            for(int i=0;i<n;i++) arr[i][0]=0;
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];  
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] ans=setmatrix(arr);
        System.out.println("Result: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}