class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr = new int[1001];
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < nums[i].length; j++){
                arr[nums[i][j]]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1001; i++){
            if(arr[i] == n) list.add(i);
        }

        return list;
    }
}