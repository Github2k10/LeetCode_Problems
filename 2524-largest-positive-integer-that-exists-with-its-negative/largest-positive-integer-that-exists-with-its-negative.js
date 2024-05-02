/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxK = function(nums) {
    let max = Number.MIN_SAFE_INTEGER;

    for(let k of nums){
        if(k > 0 && nums.includes(k * -1)){
            if(k > max) max = k;
        }
    }

    return max == Number.MIN_SAFE_INTEGER ? -1 : max;
};