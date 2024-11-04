class Solution {
    public String compressedString(String word) {
        int count = 1;
        String str = "";

        for(int i = 0; i < word.length() - 1; i++){
            char c = word.charAt(i);

            if(c == word.charAt(i + 1) && count < 9) {
                count++;
                continue;
            } else {
                str += count;
                str += c;
                count = 1;
            }
        }

        str += count;
        str += word.charAt(word.length() - 1);

        return str;
    }
}