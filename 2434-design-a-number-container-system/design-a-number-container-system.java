class NumberContainers {
    Map<Integer, TreeSet<Integer>> map;
    Map<Integer, Integer> list;
    
    public NumberContainers() {
        map = new HashMap<>();
        list = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(list.containsKey(index)){
            int num = list.get(index);
            list.put(index, number);

            map.get(num).remove(Integer.valueOf(index));
            if(map.get(num).size() == 0) map.remove(num);
        } else {
            list.put(index, number);
        }

        if(map.containsKey(number)){
            map.get(number).add(index);
        } else {
            TreeSet<Integer> k = new TreeSet<>();
            k.add(index);

            map.put(number, k);
        }
    }
    
    public int find(int number) {
        if(!map.containsKey(number)) return -1;
        return map.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */