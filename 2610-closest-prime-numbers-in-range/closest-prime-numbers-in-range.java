class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr = new boolean[right + 1];
        Arrays.fill(arr, true);
        if (left <= 1) left = 2;

        for(int p = 2; p * p <= right; p++){
            if(arr[p] == true){
                for(int i = p * p; i <= right; i += p)
                    arr[i] = false;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = left;  i < arr.length; i++){
            if(arr[i] && i >= left && i <= right) 
                list.add(i);
        }

        int[] res = {-1, -1};
        Collections.sort(list);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < min) {
                min = diff;
                res[0] = list.get(i - 1);
                res[1] = list.get(i);
            }
        }

        return res;
    }
}