// Max subarray sum using Kadane's algorithm
import java.util.*;

class Kadanes_algo {
    static int maxsubarraysum(int arr[]) {
        int res = arr[0];
        int maxend = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxend = Math.max(maxend + arr[i], arr[i]);
            res = Math.max(res, maxend);
        }
        return res;   
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int len = sc.nextInt();
        int nums[] = new int[len];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum subarray sum is " + maxsubarraysum(nums));
        sc.close();
    }
}
