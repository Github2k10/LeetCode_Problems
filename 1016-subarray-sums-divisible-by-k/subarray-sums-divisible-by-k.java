class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0, sum = 0;
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            sum = (sum + nums[i] % k + k) % k;
            c += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return c;
    }
}