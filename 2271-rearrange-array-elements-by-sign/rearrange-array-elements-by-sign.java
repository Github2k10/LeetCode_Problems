class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negitive = 0, i = 0, n = nums.length;
        int[] arr = new int[n];

        while(i < n){
            while(positive < n && nums[positive] < 0) positive++;
            arr[i++] = nums[positive++];

            while(negitive < n && nums[negitive] > 0) negitive++;
            arr[i++] = nums[negitive++];
        }

        return arr;
    }
}