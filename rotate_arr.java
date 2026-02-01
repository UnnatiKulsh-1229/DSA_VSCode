import java.util.*;
class rotate_arr{
    static int[] rotate_arr(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
         reverse(arr,0,n-d-1);
         reverse(arr,n-d,n-1);
         return arr;
        }
        public static void reverse(int[] arr,int start,int end){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                ans[i]=sc.nextInt();
            }
            int d=sc.nextInt();
            int[] result=rotate_arr(ans,d);
            System.out.println("Result: ");
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
        }
}