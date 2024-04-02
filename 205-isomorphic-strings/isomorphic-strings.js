/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    if(s.length != t.length) return false;
    let obj1 = [];
    let obj2 = [];

    for(let i = 0; i < s.length; i++){
        if(obj1[s.charAt(i)] != obj2[t.charAt(i)]) return false;
        obj1[s.charAt(i)] = i + 1;
        obj2[t.charAt(i)] = i + 1;
    }

    return true;
};