class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0, max = 0;
        Arrays.sort(tokens);

        int s = 0, e = tokens.length - 1;

        while(s <= e){
            if(power >= tokens[s]){
                power -= tokens[s++];
                score++;
                
                max = Math.max(max, score);
            } else if(score >= 1){
                power += tokens[e--];
                score--;
            } else {
                break;
            }
        }

        return max;
    }
}