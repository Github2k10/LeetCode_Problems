class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int c = 0, n = matrix.length, m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        for(int j1 = 0; j1 < m; j1++){
            for(int j2 = j1; j2 < m; j2++){
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;

                for(int i = 0; i < n; i++){
                    sum += matrix[i][j2] - (j1 > 0 ? matrix[i][j1 - 1] : 0);
                    c += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return c;
    }
}

/**
    0 1 1
    1 3 4
    1 4 4

    1 -1
    -1 1
 */