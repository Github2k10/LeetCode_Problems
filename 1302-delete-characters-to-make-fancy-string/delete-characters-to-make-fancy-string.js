/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function(s) {
    if (s.length <= 2) return s;
    let str = [];
    let n = s.length;
    str.push(s[0]);
    str.push(s[1]);

    for(let i = 2; i < n; i++){
        let a = str[str.length - 1];
        let b = str[str.length - 2];

        if(a == s[i] && b == s[i]) continue;
        str.push(s[i]);
    }

    return str.join("");
};