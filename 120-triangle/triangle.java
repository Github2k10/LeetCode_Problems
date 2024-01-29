class Solution {
    private int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new int[n + 1][triangle.get(n - 1).size() + 1];

        for(int[] d : dp) Arrays.fill(d, -1);
        return helper(0, 0, triangle);
    }

    private int helper(int i, int j, List<List<Integer>> list){
        if(j >= list.size() || i >= list.get(j).size()){
            return Integer.MAX_VALUE;
        }
        if(j == list.size() - 1) return list.get(j).get(i);

        if(dp[i][j] != -1) return dp[i][j];

        int l1 = helper(i, j + 1, list);
        int l2 = helper(i + 1, j + 1, list);

        return dp[i][j] = Math.min(l1, l2) + list.get(j).get(i);
    }
}