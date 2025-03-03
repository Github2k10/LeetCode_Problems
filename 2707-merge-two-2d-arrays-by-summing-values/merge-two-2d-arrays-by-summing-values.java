class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int max = 0;

        for(int[] arr: nums1){
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        for(int[] arr: nums2){
            map.put(arr[0], map.getOrDefault(arr[0], 0) + arr[1]);
        }

        int[][] res = new int[map.size()][2];
        int i = 0;

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            res[i][0] = m.getKey();
            res[i][1] = m.getValue();
            i++;
        }

        return res;
    }
}