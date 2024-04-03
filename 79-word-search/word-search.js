/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
    for(let i = 0; i < board.length; i++){
        for(let j = 0; j < board[i].length; j++){
            if(word[0] == board[i][j]){
                if(helper(i, j, board, word, 0)) return true;
            }
        }
    }

    return false;
};

const helper = (i, j, board, word, k) => {
    if(k == word.length) return true;
    if(i >= board.length || i < 0 || j >= board[i].length || j < 0) return false;
    if(board[i][j] != word[k]) return false;
    
    let temp = board[i][j];
    board[i][j] = ' ';

    let found = helper(i - 1, j, board, word, k + 1) ||
                helper(i, j - 1, board, word, k + 1) ||
                helper(i + 1, j, board, word, k + 1) ||
                helper(i, j + 1, board, word, k + 1);

    board[i][j] = temp;

    return found;
}