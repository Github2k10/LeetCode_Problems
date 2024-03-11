class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            if(!map.containsKey(c)) break;
            int k = map.get(c);
            map.put(c, 0);

            while(k-- > 0) sb.append(c + "");
        }

        for(Map.Entry<Character, Integer> m : map.entrySet()){
            int k = m.getValue();

            if(k > 0){
                char c = m.getKey();
                while(k-- > 0) sb.append(c + "");
            }
        }

        return sb.toString();
    }
}