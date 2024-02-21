class Solution {
    public String predictPartyVictory(String senate) {
        LinkedList<Integer> rad = new LinkedList<>();
        LinkedList<Integer> dir = new LinkedList<>();
        int n = senate.length();

        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') rad.add(i);
            else dir.add(i);
        }

        while(!rad.isEmpty() && !dir.isEmpty()){
            // System.out.println(rad + " -> " + dir);
            int r = rad.poll();
            int d = dir.poll();

            if(r < d) rad.addLast(n++);
            else dir.addLast(n++); 
        }

        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}