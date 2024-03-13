class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return 1;
        int sum = (n*(n+1))/2;
        int sum2 = 0;

        while(sum >= sum2){
            sum2 += n;
            if(sum == sum2) return n;
            sum -= n;
            n--;
        }

        return -1;
    }
}