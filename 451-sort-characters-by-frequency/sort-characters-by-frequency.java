class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[62];
        for(char c : s.toCharArray()) {
            int k = helper(c);
            if(k != -1) arr[k]++;
        }

        StringBuilder sb = new StringBuilder();

        while(true){
            int max = 0;
            int ind = -1;

            for(int j = 0; j < 62; j++){
                if(arr[j] > max) {
                    max = arr[j];
                    ind = j;
                }
            }

            if(ind == -1) break;

            char k = toChar(ind);

            while(max > 0){
                sb.append(k);
                max--;
            }

            arr[ind] = 0;
        }

        return sb.toString();
    }

    private int helper(char c){
        if(c >= 'a' && c <= 'z'){
            return c - 'a';
        } else if(c >= 'A' && c <= 'Z'){
            return c - 'A' + 26;
        } else if(c >= '0' && c <= '9'){
            return c - '0' + 52;
        }

        return -1;
    }

    private char toChar(int i){
        if(i >= 0 && i <= 25){
            return (char) (i + 97);
        } else if(i >= 26 && i <= 51){
            return (char) (i + 39);
        } else return (char) (i - 4);
    }
}