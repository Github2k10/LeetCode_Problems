class Solution {
    private int helper(int[] nums, int k){
        if(k < 0) return 0;

        int i = 0, j = 0;
        int sum = 0, c = 0;

        while(i < nums.length){
            sum += nums[i] % 2;
            while(sum > k && j < nums.length){
                sum -= nums[j] % 2;
                j++;
            }

            if(sum <= k) c += i - j + 1;
            i++;
        }

        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int c = 0;

        int a = helper(nums, k);
        int b = helper(nums, k - 1);

        return a - b;
    }
}