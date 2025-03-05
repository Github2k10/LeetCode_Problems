class Solution {
    public long coloredCells(int n) {
        long res = 1;
        int i = 1;

        while(i < n){
            res += i * 4;
            i++;
        }

        return res;   
    }
}