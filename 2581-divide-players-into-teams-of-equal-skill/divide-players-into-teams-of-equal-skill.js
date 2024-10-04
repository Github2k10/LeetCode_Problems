/**
 * @param {number[]} skill
 * @return {number}
 */
var dividePlayers = function(skill) {
    let k = null;
    let sum = 0;
    let n = skill.length;

    skill.sort((a, b) => a - b);

    for(let i = 0; i < n / 2; i++){
        if(k == null){
            k = skill[i] + skill[n - 1 - i];
        }

        if(k == skill[i] + skill[n - 1 - i]) {
            sum += skill[i] * skill[n - 1 - i];
        } else {
            return -1;
        }
    }

    return sum;
};