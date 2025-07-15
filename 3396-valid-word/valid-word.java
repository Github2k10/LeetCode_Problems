class Solution {
    public boolean isValid(String word) {
        if(word.length() <= 2) return false;

        boolean isVowel = false;
        boolean isConsonant = false;

        for(char c: word.toCharArray()){
            if((int)c < 65 && !((int)c >= 48 && (int)c <= 57)) return false;
            if((int)c >= 91 && (int)c <= 96) return false;
            if((int)c > 122) return false;

            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            ) {
                isVowel = true;
            } else if(((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)){
                isConsonant = true;
            }
        }

        System.out.println(isConsonant);
        System.out.println(isVowel);

        return isConsonant && isVowel;
    }
}