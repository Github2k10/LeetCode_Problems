class Solution {
    public int firstUniqChar(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!map.containsKey(c)){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            } else {
                map.get(c).add(i);
            }
        }

        int min = Integer.MAX_VALUE;

        for(Map.Entry<Character, List<Integer>> m : map.entrySet()){
            List<Integer> list = m.getValue();
            if(list.size() == 1 && list.get(0) < min){
                min = list.get(0);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}