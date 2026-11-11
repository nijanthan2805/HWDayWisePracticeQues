import java.util.*;
class Pair{
    int row;
    int col;
    int parent;
    public Pair(int row, int col, int parent){
        this.row = row;
        this.col = col;
        this.parent = parent;
    }
}
public class LongestIncreasingPath{
    static int count = 0;
    public static void dfs(int i, int j, int n, int m, boolean[][] vis, int[][] grid, int parent){
        if(i < 0 || i >=n || j < 0 || j >= m || vis[i][j] || grid[i][j] <= parent){
            return;
        }
        vis[i][j] = true;
        count++;
        dfs(i+1, j, n, m, vis, grid, grid[i][j]);
        dfs(i, j+1, n, m, vis, grid, grid[i][j]);
        dfs(i-1, j, n, m, vis, grid, grid[i][j]);
        dfs(i, j-1, n, m, vis, grid, grid[i][j]);
        // vis[i][j] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int grid[][] =new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int maxCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                count = 0;
                boolean[][] vis = new boolean[n][m];
                dfs(i, j, n, m, vis, grid, 0);
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.print(maxCount);
        // System.out.print(grid[2][2] == 1?4:6);
    }
}
