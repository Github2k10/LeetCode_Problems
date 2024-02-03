class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int n = arr.length;
       int[] dp = new int[n + 1];

       for(int i = 1; i <= n; i++){
           int max = 0;
           int sum = 0;

           for(int j = 1; j <= k && i - j >= 0; j++){
               max = Math.max(max, arr[i - j]);
               sum = Math.max(sum, dp[i - j] + max * j);
           }
           dp[i] = sum;
       } 
       return dp[n];
    }
}