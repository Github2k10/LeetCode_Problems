class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z = 0;
        int o = 0;

        for(char c : s.toCharArray()){
            if(c == '1') o++;
            else z++;
        }

        StringBuilder sb = new StringBuilder();
        while(o-- > 1) sb.append('1');
        while(z-- > 0) sb.append('0');

        sb.append('1');
        return sb.toString();
    }
}