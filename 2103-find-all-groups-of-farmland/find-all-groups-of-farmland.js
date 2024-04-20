/**
 * @param {number[][]} land
 * @return {number[][]}
 */
var findFarmland = function(land) {
    const farms = [];
    let n = land.length, m = land[0].length;
    let a = 0, b = 0;

    const helper = (i, j) => {
        if(i < 0 || j < 0 || i >= n || j >= m) return;
        if(land[i][j] == 0) return;

        if(i > a) a = i;
        if(j > b) b = j;

        land[i][j] = 0;

        helper(i + 1, j);
        // helper(i - 1, j, arr);
        helper(i, j + 1);
        // helper(i, j - 1, arr);
    }

    for(let i = 0; i < n; i++){
        for(let j = 0; j < m; j++){
            if(land[i][j] == 1){
                helper(i, j);
                farms.push([i, j, a, b]);
                a=0;
                b=0;
            }
        }
    }

    return farms;
};