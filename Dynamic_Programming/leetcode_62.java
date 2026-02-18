//using dp to optimise recursion and backtraking;
class Solution {
    private static int helper(int[][] matrix, int rows, int col, int m, int n) {
        if (rows == m && col == n) {// it means we reached the destination;
            return 1;
        }
        if (rows > m || col > n) {// it means we are outside of the matrix;
            return 0;
        }
        if (matrix[rows][col] != -1) {// it means we have already calculated it;
            return matrix[rows][col];
        }
        int right = helper(matrix, rows, col + 1, m, n);// moving right;
        int down = helper(matrix, rows + 1, col, m, n);// moving down;

        matrix[rows][col] = right + down;//storing the value for future use;

        return right + down;
    }

    public int uniquePaths(int m, int n) {
        int matrix[][] = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {// filling entire matrix with -1;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = -1;
            }
        }
        int answer = helper(matrix, 0, 0, m-1, n-1);
        return answer;
    }
    // public static void main(String[] args) {
    // int m = 3;
    // int n = 7;
    // int matrix[][] = new int[m][n];
    // for (int i = 0; i < matrix.length; i++) {// filling entire matrix with -1;
    // for (int j = 0; j < matrix[i].length; j++) {
    // matrix[i][j] = -1;
    // }
    // }
    // int answer = helper(matrix, 0, 0, m - 1, n - 1);
    // System.out.println(answer);
    // }
}
