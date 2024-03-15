class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        for(int i : nums) pro *= i;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                arr[i] = pro / nums[i];
            } else {
                int k = 1;
                for(int j = 0; j < nums.length; j++){
                    if(i != j) k *= nums[j];
                }
                arr[i] = k;
            }
        }

        return arr;
    }
}