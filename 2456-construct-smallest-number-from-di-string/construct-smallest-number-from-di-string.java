class Solution {
    private String result;
    public String smallestNumber(String pattern) {
        result = "987654321";
        int n = pattern.length();
        int[] arr = new int[n + 1];
        for(int i = 0; i <= n; i++){
            arr[i] = i + 1;
        }

        permute(0, pattern, arr);

        return result;
    }

    private void permute(int ind, String pattern, int[] arr){
        if(ind == arr.length){
            for(int i = 0; i < pattern.length(); i++){
                char c = pattern.charAt(i);
                if(c == 'I' && arr[i] >= arr[i + 1]){
                    return;
                }
                if(c == 'D' && arr[i] <= arr[i + 1]) {
                    return;
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i: arr) sb.append(i);

            if(result.compareTo(sb.toString()) > 1){
                result = sb.toString();
            }
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(i, ind, arr);
            permute(ind + 1, pattern, arr);
            swap(i, ind, arr);
        }
    }

    private void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}