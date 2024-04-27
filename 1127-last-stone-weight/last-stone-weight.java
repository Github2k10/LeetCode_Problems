class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n == 1) return stones[0];

        while(true){
            Arrays.sort(stones);
            if(stones[n - 2] == 0) break;
            int k = Math.abs(stones[n - 1] - stones[n - 2]);
            stones[n - 1] = 0;
            stones[n - 2] = k;
        }

        return stones[n - 1]; 
    }
}