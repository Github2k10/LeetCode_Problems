class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            } else {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s, l);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for(List<String> l : map.values()){
            list.add(l);
        }
        
        return list;
    }
}