import java.util.*;
class two_sum{
    public int[] two_sum(int tar,int[]nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(tar-nums[i])) return new int[]{map.get(tar-nums[i]),i};
            map.put(nums[i],i);
            }
            return new int[]{-1,-1};
    }
    public static void main(String args[    ]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target ");
        int k=sc.nextInt();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter  elements :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        two_sum t=new two_sum();
        int[] res=t.two_sum(k,nums);
        System.out.println(Arrays.toString(res));

    }
}