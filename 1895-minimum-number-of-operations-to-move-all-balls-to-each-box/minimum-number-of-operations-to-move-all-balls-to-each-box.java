class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        char[] chars = boxes.toCharArray();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int j = i, c = 0;

            while(j < n){
                if(chars[j] == '1') c += Math.abs(j - i);
                j++;
            }

            j = i;
            while(j >= 0){
                if(chars[j] == '1') c += Math.abs(j - i);

                j--;
            }

            arr[i] = c;
        }

        return arr;
    }
}