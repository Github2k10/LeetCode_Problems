class Solution {
    private int i;
    public String reverseParentheses(String s) {
        i = 0;
        return helper(s);
    }

    private String helper(String s){
        StringBuilder sb = new StringBuilder();

        while(i < s.length()){
            char c = s.charAt(i++);

            if(c == '('){
                String st = helper(s);
                sb.append(st);
            } else if(c == ')'){
                return sb.reverse().toString();
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}