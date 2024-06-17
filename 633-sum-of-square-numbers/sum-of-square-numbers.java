class Solution {
    public boolean judgeSquareSum(int c) {
        if(c <= 2) return true;
        long i = 0, j = (long)Math.sqrt(c);
        if(j * j == c) return true;

        while(i <= j){
            long k = (i * i) + (j * j);

            if(c == k) return true;
            else if(k > c) j--;
            else i++;

        }

        return false;
    }
}