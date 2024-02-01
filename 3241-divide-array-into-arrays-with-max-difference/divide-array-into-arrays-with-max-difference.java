class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] arr = new int[n/3][3];

        int t = 0;

        for(int i = 0; i < n/3; i++){
            int a = nums[t++];
            int b = nums[t++];
            int c = nums[t++];

            if(b - a <= k && c - b <= k && c - a <= k){
                arr[i][0] = a;
                arr[i][1] = b;
                arr[i][2] = c;
            } else return new int[][]{};
        }

        return arr;
    }
}

/**
    1 2 3 3 3 7
 */