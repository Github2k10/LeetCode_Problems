class Solution {
    private boolean flag;
    public boolean stoneGame(int[] piles) {
        flag = true;
        helper(0, piles.length, 0, 0, piles);
        return flag;
    }

    private void helper(int s, int e, int alice, int bob, int[] arr){
        if(s < 0 || e >= arr.length) return;
        if(s > e) {
            if(flag) flag = alice > bob;
            return;
        }

        helper(s + 1, e, alice + arr[s], bob, arr);
        helper(s, e - 1, alice + arr[e], bob, arr);
        helper(s + 1, e, alice, bob + arr[s], arr);
        helper(s, e - 1, alice, bob + arr[e], arr);
    }
}