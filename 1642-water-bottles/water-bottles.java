class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int drinkBottles = numBottles;

        while(emptyBottles + numBottles >= numExchange){
            emptyBottles += numBottles;
            int temp = emptyBottles % numExchange;
            int k = emptyBottles / numExchange;

            drinkBottles += k;
            numBottles = k;
            emptyBottles = temp;
        }

        return drinkBottles;
    }
}