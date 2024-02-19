class Solution {
    public boolean isPowerOfTwo(int n) {
        double k = n;
        while(k > 1){
            k /= 2;
        }

        return k == 1;
    }
}