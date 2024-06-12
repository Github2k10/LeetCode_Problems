class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;

        while(j <= k){
            // System.out.println(Arrays.toString(nums));
            switch(nums[j]){
                case 0 : {
                    swap(nums, i, j);
                    i++;
                    j++;
                }
                break;

                case 1 : {
                    j++;
                }
                break;

                case 2 : {
                    swap(nums, j, k);
                    k--;
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}