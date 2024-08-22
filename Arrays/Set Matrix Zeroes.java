class Solution {
    public void setZeroes(int[][] mat) {
        List<List<Integer>> zeroIdx = findZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            List<Integer> cols = zeroIdx.get(i);
            if (cols.isEmpty())
                continue;

            for (int col : cols) {
                zeroColumn(col, mat);
            }

            Arrays.fill(mat[i], 0);
        }
    }

    private List<List<Integer>> findZeroes(int[][] mat) {
        List<List<Integer>> zeroIdx = new ArrayList<>();
        for (int[] row : mat) {
            List<Integer> idx = new ArrayList<>();

            for (int i = 0; i < row.length; i++) {
                if (row[i] == 0)
                    idx.add(i);
            }
            zeroIdx.add(idx);
        }

        return zeroIdx;
    }

    private void zeroColumn(int col, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] = 0;
        }
    }
}
