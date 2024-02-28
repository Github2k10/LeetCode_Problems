class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        int s = 0;
        int e = products.length - 1;

        List<List<String>> list = new ArrayList<>();

        for(int i = 0; i < searchWord.length(); i++){
            while(s <= e && (i >= products[s].length() || products[s].charAt(i) != searchWord.charAt(i))) s++;
            while(s <= e && (i >= products[e].length() || products[e].charAt(i) != searchWord.charAt(i))) e--;

            List<String> l = new ArrayList<>();
            for(int j = s; j <= Math.min(e, s + 2); j++) l.add(products[j]);

            list.add(l);
        }

        return list;
    }
}