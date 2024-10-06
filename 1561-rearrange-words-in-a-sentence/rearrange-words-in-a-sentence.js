/**
 * @param {string} text
 * @return {string}
 */
var arrangeWords = function(text) {
    let k = text[0];
    k = k.toLowerCase();
    let temp = text.substring(1);
    text = k + temp;

    let words = text.split(" ");
    words.sort((a, b) => {
        if(a.length > b.length) return 1;
        else if(a.length < b.length) return -1;
        return 0;
    });

    text = words.join(" ");
    k = text[0];
    temp = text.substring(1);
    text = k.toUpperCase() + temp;
    return text;
};