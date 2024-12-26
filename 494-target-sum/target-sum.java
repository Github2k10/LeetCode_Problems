class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0, 0, target, nums);
    }

    private int helper(int i, int sum, int t, int[] arr){
        if(i == arr.length){
            return sum == t ? 1 : 0;
        }

        int l = helper(i + 1, sum + arr[i], t, arr);
        int k = helper(i + 1, sum - arr[i], t, arr);

        return l + k;
    }
}