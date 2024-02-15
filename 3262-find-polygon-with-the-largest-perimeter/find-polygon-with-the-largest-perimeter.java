class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0, largest = -1;

        for(int i = 0; i < nums.length; i++){
            if(sum > nums[i]) largest = sum + nums[i];
            sum += nums[i];
        }

        return largest;
    }
}

/**
    1 1 2 3 5 12 50
 */