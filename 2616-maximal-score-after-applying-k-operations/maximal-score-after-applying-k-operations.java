class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long score = 0;

        for(int i : nums) pq.add(i);

        while(k-- > 0) {
            int temp = pq.poll();
            score += temp;
            pq.offer((temp + 2)/ 3);
        }

        return score;
    }
}