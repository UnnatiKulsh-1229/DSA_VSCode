import java.util.*;
class miss_num {
    static int miss_num(int[] arr) {
        int n = arr.length + 1;
        long arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        long sum = (long) n * (n + 1) / 2;
        return (int)(sum - arr_sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int res = miss_num(num);
        System.out.println("Missing number:");
        System.out.println(res);
    }
}
