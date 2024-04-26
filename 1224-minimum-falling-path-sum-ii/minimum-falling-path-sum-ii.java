class Solution {
    private int[][] dp;

    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        dp = new int[n][n];

        for(int i = 0; i < n; i++) dp[0][i] = grid[0][i];

        helper(1, n, grid);

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            ans = Math.min(dp[n - 1][i], ans);
        }


        return ans;
    }

    private void helper(int row, int n, int[][] grid){
        if(row == n) return;

        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < n; j++){
                if(i != j)
                    min = Math.min(dp[row - 1][j], min);
            }

            dp[row][i] = grid[row][i] + min;
        }

        helper(row + 1, n, grid);
    }
}