class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int p = 1, i = 0, c = 0;

        for(int j = 0; j < nums.length; j++){
            p *= nums[j];

            while(p >= k) {
                p /= nums[i];
                i++;
            }

            c += j - i + 1;
        }

        return c;
    }
}