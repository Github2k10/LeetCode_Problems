class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        for(int i : nums) arr[i]++;

        int max = 0, c = 0;

        for(int i : arr) if(i > max) max = i;
        for(int i : arr) if(max == i) c += i;

        return c;
    }
}