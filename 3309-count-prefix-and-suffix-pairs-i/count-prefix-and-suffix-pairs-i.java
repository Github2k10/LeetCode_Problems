class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                count += isPrefixAndSuffix(words[i], words[j]) ? 1 : 0;
            }
        }

        return count;
    }

    private boolean isPrefixAndSuffix(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        int i = 0;
        while(i < s1.length()){
            if(s1.charAt(i) != s2.charAt(i)) return false;
            i++;
        }

        i = s1.length() - 1;
        int j = s2.length() - 1;

        while(i >= 0){
            if(s1.charAt(i) != s2.charAt(j)) return false;
            i--;
            j--;
        }

        return true;
    }
}