import java.util.*;
class Array_prod{
    static  int[] Array_prod_except(int[] arr){
        int n=arr.length;
        int zero=0;
        int prod=1;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                idx=i;
            }
            else{
                prod*=arr[i];
            }
        }
        int[] res= new int[n];
        Arrays.fill(res,0);
        if(zero==0){
            for(int i=0;i<n;i++){
                res[i]=prod/arr[i];
            }        
        }
        else if(zero==1){
            res[idx]=prod;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter number:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=Array_prod_except(arr);
        System.out.println("Result:");
        for(int i:ans){
            System.out.print(i +" ");
        }
        sc.close();
    }
}