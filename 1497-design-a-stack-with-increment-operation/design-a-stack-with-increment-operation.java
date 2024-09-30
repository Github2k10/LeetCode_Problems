class CustomStack {
    private int[] arr;
    private int ind;
    private int maxInd;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        ind = -1;
        maxInd = maxSize;
    }
    
    public void push(int x) {
        if(ind < maxInd - 1){
            ind++;
            arr[ind] = x;
        }
    }
    
    public int pop() {
        if(ind >= 0){
            return arr[ind--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < maxInd; i++){
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */