public class TwoDMatrixBinarySearch {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int L = 0;
            int R = matrix[i].length - 1;
            while (L <= R) {
                int mid = (L + R) / 2;
                if (matrix[i][mid] < target) {
                    L = mid + 1;
                } else if (matrix[i][mid] > target) {
                    R = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;

    }
}
