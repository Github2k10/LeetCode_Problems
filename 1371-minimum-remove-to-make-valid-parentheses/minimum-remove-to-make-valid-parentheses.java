class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0, close = 0, flag = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                flag++;
            } else if(c == ')' && flag > 0){
                close++;
                flag--;
            }
        }

        int k = Math.min(open, close);
        open = k;
        close = k;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                if(open > 0){
                    sb.append('(');
                    open--;
                }
                continue;
            }

            if(c == ')'){
                if(close > 0 && close > open){
                    sb.append(")");
                    close--;
                }
                continue;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}