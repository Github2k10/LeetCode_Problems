class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        int n = (low + "").length();
        int m = (high + "").length();

        List<Integer> list = new ArrayList<>();

        while(n <= m){
            int i = 0;
            while(i + n < 10){
                int k = Integer.parseInt(num.substring(i, n + i));
                if(k >= low && k <= high)
                    list.add(k);
                i++;
            }
            n++;
        }

        return list;
    }
}