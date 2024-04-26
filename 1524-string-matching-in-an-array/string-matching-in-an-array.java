class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> ans = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(words[j].contains(words[i]) && i != j){
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}