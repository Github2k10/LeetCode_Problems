class ProductOfNumbers {
    int[] arr;
    int ind;
    public ProductOfNumbers() {
        arr = new int[40000];
        ind = 0;
    }
    
    public void add(int num) {
        arr[ind++] = num;
    }
    
    public int getProduct(int k) {
        int num = 1;

        while(k-- > 0){
            num *= arr[ind - k - 1];
        }

        return num;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */