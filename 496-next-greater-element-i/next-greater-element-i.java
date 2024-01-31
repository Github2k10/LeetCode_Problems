class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        for(int i = 0; i < nums2.length; i++){
            arr[nums2[i]] = i;
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = helper(arr[nums1[i]], nums2);
        }
        return nums1;
    }

    private int helper(int k, int[] arr){
        int j = k + 1;

        while(j < arr.length){
            if(arr[j] > arr[k]) return arr[j];
            j++;
        }
        return -1;
    }
}