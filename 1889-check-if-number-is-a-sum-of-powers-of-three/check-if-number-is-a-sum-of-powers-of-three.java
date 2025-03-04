class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n > 0){
            int q = n % 3;
            int r = n / 3;

            if(q == 2) return false;
            n = (int)(n / 3);
        }
        return true;
    }
}