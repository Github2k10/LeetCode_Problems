/**
 * @param {string[]} words
 * @return {number[]}
 */
var sumPrefixScores = function(words) {
    let trie = new Trie();

    for(let word of words){
        trie.insert(word);
    }

    const ans = words.map(word => trie.getSum(word));
    return ans;
};

class TrieNode{
    constructor(){
        this.childNode = {};
        this.count = 0
    }
}

class Trie{
    constructor(){
        this.root = new TrieNode();
    }

    insert(word){
        let node = this.root;

        for(let char of word){
            if(!node.childNode[char]){
                node.childNode[char] = new TrieNode();
            }

            node = node.childNode[char];
            node.count++;
        }
    }

    getSum(word){
        let node = this.root;
        let count = 0;

        for(let char of word){
            node = node.childNode[char];
            count += node.count;
        }

        return count;
    }
}