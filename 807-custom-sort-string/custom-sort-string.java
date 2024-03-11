class Solution {
    public String customSortString(String order, String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            if(arr[c - 'a'] == 0) break;
            while(arr[c - 'a']-- > 0) sb.append(c + "");
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                char c = (char)('a' + i);
                while(arr[i]-- > 0) sb.append(c + "");
            }
        }

        return sb.toString();
    }
}