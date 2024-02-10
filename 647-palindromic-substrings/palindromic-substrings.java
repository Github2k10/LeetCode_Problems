class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(check(i, j, s)) count++;
            }
        }

        return count;
    }

    private boolean check(int i, int j, String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}