class Solution {
    private void find(int i, int[] arr, List<Integer> list, List<List<Integer>> l){
        if(i == arr.length) {
            l.add(new ArrayList<>(list));
            return;
        }

        find(i + 1, arr, list, l);
        list.add(arr[i]);
        find(i + 1, arr, list, l);
        list.remove(list.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(); 

        find(0, nums, new ArrayList<>(), list);

        return list;
    }
}