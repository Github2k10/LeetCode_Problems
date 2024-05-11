class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int t = 0, n = happiness.length - 1;

        Arrays.sort(happiness);

        while(t < k){
            ans += happiness[n - t] - t >= 0 ? happiness[n - t] - t : 0;
            t++;
        }

        return ans;
    }
}