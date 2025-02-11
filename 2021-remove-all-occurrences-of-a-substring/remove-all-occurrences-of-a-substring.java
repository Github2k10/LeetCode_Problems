class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int n = part.length();

        while(sb.indexOf(part) != -1){
            int i = sb.indexOf(part);
            sb.delete(i, i + n);
        }

        return sb.toString();
    }
}