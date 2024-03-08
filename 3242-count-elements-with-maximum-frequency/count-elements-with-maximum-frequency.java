class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        for(int i : nums) arr[i]++;
        Arrays.sort(arr);

        int c = 0, i = arr.length - 1;
        int k = arr[i];

        while(i >= 0){
            if(arr[i] == k) c += k;
            else break;
            i--;
        }

        return c;
    }
}