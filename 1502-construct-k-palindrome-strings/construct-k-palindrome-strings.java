class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length()) return false;
        
        int[] chars = new int[26];

        for(char c : s.toCharArray()){
            chars[c - 'a']++;
        }

        int count = 0;

        for(int i : chars){
            int t = i % 2;
            count += t;
        }

        return count <= k;
    }
}