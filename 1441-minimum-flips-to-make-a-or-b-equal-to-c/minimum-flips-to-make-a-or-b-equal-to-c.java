class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;

        for(int i = 0; i < 32; i++){
            int x = a & 1;
            int y = b & 1;
            int z = c & 1;
            System.out.println(x + " : " + y + " : " + z);

            a = a >> 1;
            b = b >> 1;
            c = c >> 1;

            if(z == 0){
                if(x == 1) count++;
                if(y == 1) count++;
            } else {
                if(x == 0 && y == 0) count++;
            }
        }

        return count;
    }
}