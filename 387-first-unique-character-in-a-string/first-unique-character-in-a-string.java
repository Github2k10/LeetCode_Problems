class Solution {
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;

        for(char c = 'a'; c <= 'z'; c++){
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            if(first != -1 && last - first == 0){
                if(first < min) min = first;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}