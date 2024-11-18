class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];

        if(k == 0) return arr;

        for(int i = 0; i < n; i++){
            int t = k, j = i, sum = 0;

            if(t > 0){
                while(t-- > 0) {
                    j++;
                    sum += code[j % (n)];
                }
            } else {
                while(t++ < 0){
                    j--;
                    if(j < 0) j = n - 1;
                    sum += code[j];
                }
            }

            arr[i] = sum;
        }

        return arr;
    }
}