class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[128];
        for(char c : s.toCharArray()) arr[c]++;

        StringBuilder sb = new StringBuilder();

        while(true){
            int max = 0;
            int ind = -1;

            for(int j = 0; j < 128; j++){
                if(arr[j] > max) {
                    max = arr[j];
                    ind = j;
                }
            }

            if(ind == -1) break;

            while(max > 0){
                sb.append((char)ind);
                max--;
            }

            arr[ind] = 0;
        }

        return sb.toString();
    }
}