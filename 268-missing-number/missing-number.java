class Solution {
    public int missingNumber(int[] nums) {
        int k = nums.length;

        for(int i = 0; i < nums.length; i++){
            k ^= nums[i];
            k ^= i;
        }

        return k;
    }
}