/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let max = 0;
    let temp = 0;

    for(let i = 0; i < s.length; i++){
        if(s.charAt(i) == '(') {
            temp++;
            max = temp > max ? temp : max;
        } else if(s.charAt(i) == ')'){
            temp--;
        }
    }

    return max;
};