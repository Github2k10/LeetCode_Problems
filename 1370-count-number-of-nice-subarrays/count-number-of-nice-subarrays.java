class Solution {
    private int helper(int[] nums, int k){
        if(k < 0) return 0;

        int i = 0, j = 0;
        int sum = 0, c = 0;

        while(i < nums.length){
            sum += nums[i];
            while(sum > k && j < nums.length){
                sum -= nums[j];
                j++;
            }

            if(sum <= k) c += i - j + 1;
            i++;
        }

        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int c = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]  % 2 == 0) nums[i] = 0;
            else nums[i] = 1;
        }

        int a = helper(nums, k);
        int b = helper(nums, k - 1);

        return a - b;
    }
}