class Solution {
    private List<String> list;
    private char[] ch = {'a', 'b', 'c'};
    public String getHappyString(int n, int k) {
        list = new ArrayList<>();
        helper(0, n, new StringBuilder());
        // System.out.println(list);
        return k > list.size() ? "" : list.get(k - 1);
    }

    private void helper(int i, int n, StringBuilder s){
        if(i == n) {
            if(s.indexOf("aa") == -1 && s.indexOf("bb") == -1 && s.indexOf("cc") == -1)
                list.add(s.toString());
            return;
        }

        for(int a = 0; a <= 2; a++){
            s.append(ch[a]);
            helper(i + 1, n, s);
            int k = s.length();
            s.delete(k - 1, k);
        }
    }
}