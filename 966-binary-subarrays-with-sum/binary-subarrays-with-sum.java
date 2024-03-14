class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] count = new int[n + 1];
        count[0] = 1;
        int odd = 0, res = 0;

        for(int i : nums){
            odd += i;
            if(odd >= goal){
                res += count[odd - goal];
            }
            count[odd]++;
        }

        return res;
    }
}