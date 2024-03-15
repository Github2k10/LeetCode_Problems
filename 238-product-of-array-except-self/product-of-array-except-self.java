class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = pro;
            pro *= nums[i];
        }

        pro = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            arr[i] *= pro;
            pro *= nums[i];
        }

        return arr;
    }
}