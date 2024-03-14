class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, c = 0;
        map.put(0, 1);

        for(int i : nums){
            sum += i;
            if(map.containsKey(sum - goal)){
                c += map.get(sum - goal);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return c;
    }
}