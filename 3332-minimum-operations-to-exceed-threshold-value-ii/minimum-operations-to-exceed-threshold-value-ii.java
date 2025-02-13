class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        for(int i: nums) q.add((long)i);

        int count = 0;

        while(q.size() > 1 && q.peek() < k){
            long a = q.poll();
            long b = q.poll();

            q.offer((Math.min(a, b) * 2) + Math.max(a, b));
            count++;
        }

        return count;
    }
}