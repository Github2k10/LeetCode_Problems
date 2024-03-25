class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length + 1];

        for(int i : nums){
            if(arr[i] == 0){
                arr[i] = 1;
            } else list.add(i);
        }

        return list;
    }
}