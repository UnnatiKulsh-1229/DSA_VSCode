import java.util.*;

class Solution {
    static ArrayList<int[]> merge_intervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < arr.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] cur = arr[i];

            if (cur[0] <= last[1]) {
                last[1] = Math.max(last[1], cur[1]);
            } else {
                res.add(new int[]{cur[0], cur[1]});
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        ArrayList<int[]> ans = merge_intervals(arr);

        System.out.println("Merged Intervals:");
        for (int[] interval : ans) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        sc.close();
    }
}
