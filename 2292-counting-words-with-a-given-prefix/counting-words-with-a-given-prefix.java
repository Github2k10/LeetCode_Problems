class Solution {
    public int prefixCount(String[] words, String pref) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        return list.stream().map(word -> word.startsWith(pref) ? 1 : 0).mapToInt(Integer::intValue).sum();
    }
}