class Solution {
    public String compressedString(String word) {
        int count = 1;
        List<String> list = new ArrayList<>();
        String str = "";

        for(int i = 0; i < word.length() - 1; i++){
            char c = word.charAt(i);

            if(c == word.charAt(i + 1) && count < 9) {
                count++;
                continue;
            } else {
                list.add(String.valueOf(count));
                list.add(String.valueOf(c));
                // str += count;
                // str += c;
                count = 1;
            }
        }

        // str += count;
        // str += word.charAt(word.length() - 1);

        list.add(String.valueOf(count));
        list.add(String.valueOf(word.charAt(word.length() - 1)));
        // list.add(word.charAt(word.length() - 1));

        return list.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}