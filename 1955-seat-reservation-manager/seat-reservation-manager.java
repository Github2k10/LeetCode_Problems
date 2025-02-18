class SeatManager {
    PriorityQueue<Integer> queue;
    public SeatManager(int n) {
        queue = new PriorityQueue<>();
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }
    }
    
    public int reserve() {
        int seat = queue.poll();
        return seat;
    }
    
    public void unreserve(int seatNumber) {
        queue.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */