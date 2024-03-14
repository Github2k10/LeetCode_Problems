class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;

        for(int i = 0; i < nums.length; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = i; j < nums.length; j++){
                if(nums[j] > max) max = nums[j];
                if(nums[j] < min) min = nums[j];
                sum += Math.abs(max - min);
            }
        }

        return sum;
    }
}