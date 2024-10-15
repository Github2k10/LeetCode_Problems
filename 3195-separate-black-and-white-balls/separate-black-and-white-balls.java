class Solution {
    public long minimumSteps(String s) {
        int k = 0;
        long count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') {
                count += i - k;
                k++;
            }
        }

        return count;
    }
}