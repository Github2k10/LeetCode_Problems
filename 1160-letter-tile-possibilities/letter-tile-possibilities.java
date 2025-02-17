class Solution {
    Set<String> set;
    public int numTilePossibilities(String tiles) {
        set = new HashSet<>();
        permute(0, tiles.toCharArray());

        // System.out.println(set);
        return set.size();
    }

    private void permute(int ind, char[] arr){
        if(ind == arr.length){
            subset(new StringBuilder(), 0, arr);
            return;
        }

        for(int i = ind; i < arr.length; i++){
            swap(i, ind, arr);
            permute(ind + 1, arr);
            swap(i, ind, arr);
        }
    }

    private void subset(StringBuilder sb, int i, char[] arr){
        if(i == arr.length) {
            if(sb.length() > 0)
                set.add(sb.toString());
            return;
        }

        subset(new StringBuilder(sb), i + 1, arr);
        sb.append(arr[i]);
        subset(sb, i + 1, arr);
    }

    private void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}