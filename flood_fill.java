import java.util.*;
class flood_fill {
    private void dfs(int row, int col, int old_col, int new_col, int[][] res, int[] rows, int[] cols) {
        res[row][col] = new_col;
        for (int i = 0; i < 4; i++) {
            int nrow = row + rows[i];
            int ncol = col + cols[i];
            if (nrow >= 0 && nrow < res.length &&
                ncol >= 0 && ncol < res[0].length &&
                res[nrow][ncol] == old_col) {
                dfs(nrow, ncol, old_col, new_col, res, rows, cols);
            }
        }
    }
    public int[][] flood_fill(int[][] img, int sr, int sc, int newcolor) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                res[i][j] = img[i][j];
            }
        }
        int oldcolor = img[sr][sc];
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        dfs(sr, sc, oldcolor, newcolor, res, delrow, delcol);
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting row, starting column, new color and size of the image");
        int sr = sc.nextInt();
        int scCol = sc.nextInt();
        int newcolor = sc.nextInt();
        int n = sc.nextInt();
        int[][] img = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = sc.nextInt();
            }
        }
        flood_fill ff = new flood_fill();
        int[][] res = ff.flood_fill(img, sr, scCol, newcolor);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}