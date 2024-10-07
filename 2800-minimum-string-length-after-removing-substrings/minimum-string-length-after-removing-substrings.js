/**
 * @param {string} s
 * @return {number}
 */
var minLength = function(s) {
    let k = [];

    for(let i = 0; i < s.length; i++){
        let t = s[i];

        if(k[k.length - 1] == 'A' && s[i] == 'B') {
            k.pop();
        } else if(k[k.length - 1] == 'C' && s[i] == 'D') {
            k.pop();
        } else {
            k.push(s[i]);
        }
    }

    return k.length;
};