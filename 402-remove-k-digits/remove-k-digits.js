/**
 * @param {string} num
 * @param {number} k
 * @return {string}
 */
var removeKdigits = function(num, k) {
    if(num.length == k) return "0";
    let s =  [];
    let i = 0;

    while(i < num.length){
        let a = num[i];

        while(a < s[s.length - 1] && k > 0){
            s.pop();
            k--;
        }

        s.push(a);
        i++;
        if(k == 0) break;
    }

    while(i < num.length){
        s.push(num[i]);
        i++;
    }

    while(s[0] == '0' && s.length > 1){
        s.shift();
    }

    if(k > 0){
        while(k > 0){
            s.pop();
            k--;
        }
    }

    if(s.length == 0) return "0";
    return s.join("");
};