/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    let c = 0;

    const helper = (i, j) => {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if(grid[i][j] == 0) return;

        grid[i][j] = 0;

        helper(i - 1, j, grid);
        helper(i + 1, j, grid);
        helper(i, j - 1, grid);
        helper(i, j + 1, grid);
    }

    for(let i = 0; i < grid.length; i++){
        for(let j = 0; j < grid[0].length; j++){
            if(grid[i][j] == 1){
                c++;
                helper(i, j, grid);
            }
        }
    }

    return c;
};