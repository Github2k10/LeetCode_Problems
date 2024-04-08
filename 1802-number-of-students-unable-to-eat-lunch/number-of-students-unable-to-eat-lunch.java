class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int z = 0, o = 0;

        for(int i : students){
            if(i == 1) o++;
            else z++;
        }

        for(int i : sandwiches){
            if(i == 1 && o > 0) o--;
            else if(i == 0 && z > 0) z--;
            else break;
        }

        return z + o;
    }
}