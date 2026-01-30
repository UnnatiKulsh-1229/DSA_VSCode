import java.util.*;
class max_Water{
    static int maxwater(int[] nums){
        int l=0;
        int r=nums.length-1;
        int res=0;
        while(l<r){
            int amount=Math.min(nums[l],nums[r])*(r-l);
            res=Math.max(res,amount);
            if(nums[l]<=nums[r]) l+=1;
            else r-=1;
            }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxwater(arr);
        System.out.println("Maximum water  is: ");
        System.out.println(ans);

    }

}