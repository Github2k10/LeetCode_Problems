class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        List<Integer> list = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < n; i++){
            if(list.isEmpty()){
                list.add(prices[i]);
            } else {
                while(!list.isEmpty() && list.get(list.size() - 1) > prices[i]){
                    list.remove(list.size() - 1);
                }

                list.add(prices[i]);
                max = Math.max(max, prices[i] - list.get(0));
            }
        }

        return max;
    }
}