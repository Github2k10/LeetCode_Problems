class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negitive = 1;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                arr[positive] = nums[i];
                positive += 2;
            } else {
                arr[negitive] = nums[i];
                negitive += 2;
            }
        }

        return arr;
    }
}