/**
 * @param {number[][]} land
 * @return {number[][]}
 */
var findFarmland = function(land) {
    const farms = [];
    let n = land.length, m = land[0].length;

    const helper = (i, j, arr) => {
        if(i < 0 || j < 0 || i >= n || j >= m) return;
        if(land[i][j] == 0) return;

        if(i > arr[2]) arr[2] = i;
        if(j > arr[3]) arr[3] = j;

        land[i][j] = 0;

        helper(i + 1, j, arr);
        // helper(i - 1, j, arr);
        helper(i, j + 1, arr);
        // helper(i, j - 1, arr);
    }

    for(let i = 0; i < n; i++){
        for(let j = 0; j < m; j++){
            if(land[i][j] == 1){
                const arr = [];
                arr.push(i);
                arr.push(j);
                arr.push(i);
                arr.push(j);

                helper(i, j, arr);
                farms.push(arr);
            }
        }
    }

    return farms;
};