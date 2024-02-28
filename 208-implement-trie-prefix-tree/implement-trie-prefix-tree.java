class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        int level;
        int index;
        int len = word.length();

        TrieNode node = root;

        for(level = 0; level < len; level++){
            index = word.charAt(level) - 'a';
            if(node.child[index] == null){
                node.child[index] = new TrieNode();
            }
            node = node.child[index];
        }

        node.isEnd = true;
    }
    
    public boolean search(String word) {
        int level;
        int index;
        int len = word.length();

        TrieNode node = root;

        for(level = 0; level < len; level++){
            index = word.charAt(level) - 'a';
            if(node.child[index] == null){
                return false;
            }
            node = node.child[index];
        }

        return node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        int index;
        int level;
        int len = prefix.length();

        TrieNode node = root;

        for(level = 0; level < len; level++){
            index = prefix.charAt(level) - 'a';
            if(node.child[index] == null) return false;
            node = node.child[index];
        }

        return true;
    }
}

class TrieNode{
    boolean isEnd;
    TrieNode[] child = new TrieNode[26];

    TrieNode(){
        isEnd = false;
        for(int i = 0; i < 26; i++){
            child[i] = null;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */