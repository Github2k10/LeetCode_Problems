class Solution {
    public int minimumLength(String s) {
        int[] chars = new int[26];

        for(char c : s.toCharArray()){
            chars[c - 'a'] += 1;
        }

        int count = 0;

        for(int i : chars){
            if(i > 0){
                if(i % 2 == 0) count += 2;
                    else count += 1;
            }
        }

        return count;
    }
}