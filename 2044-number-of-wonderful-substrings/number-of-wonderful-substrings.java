class Solution {
    public long wonderfulSubstrings(String word) {
        int[] count = new int[1024];
        long ans = 0;
        int xor = 0;
        count[xor] = 1;

        for(char ch : word.toCharArray()){
            int charInd = ch - 'a';

            xor ^= 1 << charInd;
            ans += count[xor];

            for(int i = 0; i < 10; i++){
                ans += count[xor ^ (1 << i)];
            }
            count[xor]++;
        }

        return ans;
    }
}