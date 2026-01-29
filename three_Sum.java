//three sum such that sum is zero
import java.util.*;
class three_Sum{
    static List<List<Integer>> threesum(int[] arr){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                int value=(-1)*(arr[j]+arr[k]);
                if(map.containsKey(value)){
                    for(int i:map.get(value)){
                        res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
            map.putIfAbsent(arr[j],new ArrayList<>());
            map.get(arr[j]).add(j);
        }
        return  res;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int p=0;p<n;p++){
            arr[p]=sc.nextInt();
        }
        List<List<Integer>> ans=threesum(arr);
        System.out.println("Result:" );
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
}