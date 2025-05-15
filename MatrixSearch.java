
public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1; // Start from top-right

        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                System.out.println("Target found at position: (" + row + ", " + col + ")");
                return true;
            } else if (current < target) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }

        System.out.println("Target not found.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 5, 4},
            {5, 6, 7, 8},
            {9, 12, 10, 11}
        };

        int target = 11;
        searchMatrix(matrix, target);
    }
}
