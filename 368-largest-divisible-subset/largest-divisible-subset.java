class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length; 
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        Arrays.sort(nums);

        int size = 1, ind = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if(dp[i] > size){
                        size = dp[i];
                        ind = i;
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        int m = nums[ind];
        for(int i = ind; i >= 0; i--){
            if(m % nums[i] == 0 && dp[i] == size){
                list.add(nums[i]);
                m = nums[i];
                size--;
            }
        }

        return list;
    }
}