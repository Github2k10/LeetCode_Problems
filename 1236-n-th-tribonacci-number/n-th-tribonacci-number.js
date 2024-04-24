/**
 * @param {number} n
 * @return {number}
 */
var tribonacci = function(n) {
    const dp = [];

    const helper = (k) => {
        if(dp[k] != undefined) return dp[k];
        if(k == 0) return 0;
        if(k <= 2) return 1;

        return dp[k] = helper(k - 1) + helper(k - 2) + helper(k - 3);
    }

    return helper(n);
};
