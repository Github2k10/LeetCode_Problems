class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> list = new ArrayList<>();
        Arrays.sort(folder);

        int i = 0, n = folder.length;

        while(i < n) {
            String s = folder[i];
            list.add(s);

            int j = i + 1;

            while(j < n && folder[j].indexOf(s + '/') == 0) {
                j++;
            }   

            i = j;
        }

        return list;
    }
}