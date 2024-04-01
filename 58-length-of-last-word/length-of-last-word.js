/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let k = s.trim().split(" ");
    return k[k.length - 1].length;
};