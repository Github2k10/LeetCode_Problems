class Solution {
    private Set<List<Integer>> set;

    public List<List<Integer>> combinationSum3(int k, int n) {
        set = new HashSet<>();
        helper(1, k, n, 0, new ArrayList<>());
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

    private void helper(int i, int k, int n, int sum, List<Integer> list){
        if(list.size() > k || sum > n) return;
        if(sum == n && list.size() == k){
            // System.out.println(list);
            set.add(new ArrayList<>(list));
            return;
        }

        for(int a = i; a <= 9; a++){
            list.add(a);
            helper(a + 1, k, n, sum + a, list);
            list.remove(list.size() - 1);
        }
    }
}