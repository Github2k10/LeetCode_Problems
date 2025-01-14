class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] arr = new int[n];
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[A[i] - 1]++;
            arr[B[i] - 1]++;

            int count = 0;
            for(int t : arr){
                if(t % 2 == 0 && t > 0) count++;
            }
            ans[i] = count;
        }

        return ans;
    }
}