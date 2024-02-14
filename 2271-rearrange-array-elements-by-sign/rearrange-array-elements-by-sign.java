class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negitive = 1, i = 0, n = nums.length;
        int[] arr = new int[n];

        for(int k : nums){
            if(k > 0){
                arr[positive] = k;
                positive += 2;
            } else {
                arr[negitive] = k;
                negitive += 2;
            }
        }

        return arr;
    }
}