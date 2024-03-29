class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max = Long.MIN_VALUE, count = 0;
        long l = 0, r = 0, ans = 0;

        for(int i : nums) if(i > max) max = i;

        while(r < nums.length || l > r){
            if(nums[(int)r] == max) count++;

            while(count >= k){
                if(nums[(int)l] == max) count--;
                l++;
                ans += nums.length - r;
            }
            r++;
        }

        return ans;
    }
}