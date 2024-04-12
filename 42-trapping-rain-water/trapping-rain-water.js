/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let n = height.length;
    let leftMax = [];
    let rightMax = [];

    for(let i = 0; i < n; i++){
        leftMax.push(Math.max(height[i], leftMax[leftMax.length - 1] || 0));
    }

    for(let i = n - 1; i >= 0; i--){
        rightMax.unshift(Math.max(height[i], rightMax[0] || 0));
    }

    let count = 0;

    for(let i = 0; i < n; i++){
        count += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return count;
};
