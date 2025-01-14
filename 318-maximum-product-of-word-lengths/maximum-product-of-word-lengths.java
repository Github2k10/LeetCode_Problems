class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        int n = words.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = bitMask(words[i]);
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i] & arr[j]) == 0) 
                    max = Math.max(max, words[i].length() * words[j].length());
            }
        }

        return max;
    }

    private int bitMask(String word){
        int bitmask = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int position = c - 'a';
            bitmask |= (1 << position);
        }

        return bitmask;
    }
}