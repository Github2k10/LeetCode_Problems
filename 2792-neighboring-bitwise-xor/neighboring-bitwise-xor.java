class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int k = 0;

        for(int num: derived){
            k ^= num;
        }

        return k == 0;
    }
}