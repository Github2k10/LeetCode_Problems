class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] arr = new int[n];
        int[] ans = new int[n];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(++arr[A[i] - 1] == 2) count++;
            if(++arr[B[i] - 1] == 2) count++;

            ans[i] = count;
        }

        return ans;
    }
}