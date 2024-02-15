class Solution {
    public long largestPerimeter(int[] nums) {
        long largest = -1;
        Arrays.sort(nums);
        long sum = nums[0] + nums[1];

        for(int i = 2; i < nums.length; i++){
            if(sum > nums[i]) largest = sum + nums[i];
            sum += nums[i];
        }

        return largest;
    }
}

/**
    1 1 2 3 5 12 50
 */