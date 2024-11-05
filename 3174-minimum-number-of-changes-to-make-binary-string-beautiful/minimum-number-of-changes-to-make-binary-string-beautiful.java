class Solution {
    public int minChanges(String s) {
        int count = 0, i = 0;

        while(i < s.length()){
            char c1 = s.charAt(i++);
            char c2 = s.charAt(i++);

            if(c1 != c2) count++;
        }

        return count;
    }
}