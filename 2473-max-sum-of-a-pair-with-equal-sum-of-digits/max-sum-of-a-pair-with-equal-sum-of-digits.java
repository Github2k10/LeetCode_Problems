class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        int max = -1;

        for(int i = 0; i < n; i++){
            int temp = helper(nums[i]);

            if(map.containsKey(temp)){
                map.get(temp).add(nums[i]);
            } else {
                List<Integer> set = new ArrayList<>();
                set.add(nums[i]);
                map.put(temp, set);
            }
        }

        for(Map.Entry<Integer, List<Integer>> m: map.entrySet()){
            List<Integer> list = m.getValue();
            int s = list.size();
            if(s == 1) continue;
            Collections.sort(list);

            int a = list.get(s - 1);
            int b = list.get(s - 2);

            max = Math.max(max, a + b);
        }
       
        return max;
    }

    private int helper(int num){
        String s = num + "";
        int count = 0;

        for(char ch: s.toCharArray()){
            count += ch - '0';
        }

        return count;
    }
}