class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long score = 0;

        for(int i : nums) pq.add(i);

        while(k-- > 0) {
            int temp = pq.poll();
            score += temp;
            pq.add((int)Math.ceil(temp / 3.0));
        }

        return score;
    }
}