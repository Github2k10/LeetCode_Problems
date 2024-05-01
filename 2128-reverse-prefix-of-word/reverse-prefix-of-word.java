class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) == -1) return word;
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while(i < word.length()){
            char c = word.charAt(i);
            sb.append(c);
            i++;
            if(ch == c) break;
        }

        sb = sb.reverse();

        while(i < word.length()){
            sb.append(word.charAt(i));
            i++;
        }

        return sb.toString();
    }
}