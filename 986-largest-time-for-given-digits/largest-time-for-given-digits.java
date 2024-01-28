class Solution {
    private int a = -1, b = -1;
    public String largestTimeFromDigits(int[] arr) {
        permute(arr, 0, 3);
        String s = (a <= 9 ? "0" + a : a + "") + ":" + (b <= 9 ? "0" + b : b + "");
        return a < 0 ? "" : s;
    }

    private void permute(int[] arr, int l, int r) {
        if (l == r) {
            int a1 = arr[0] * 10 + arr[1];
            int b1 = arr[2] * 10 + arr[3];

            if(a1 >= 0 && a1 <= 23 && b1 >= 0 && b1 <= 59){
                if(a1 > a){
                    a = a1;
                    b = b1;
                } else if(a1 == a){
                    if(b1 > b){
                        b = b1;
                    }
                }
            }
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i);
        }
    }

    private void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}