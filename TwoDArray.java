import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Proper try-with-resources block
        try (Scanner sc = new Scanner(System.in)) {
            int n = 3;
            int[][] mat = new int[n][n];

            System.out.println("Enter a 3x3 matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            int magicSum = 0;
            for (int i = 0; i < n; i++) {
                magicSum += mat[0][i];
            }

            boolean isMagicSquare = true;

            // Check rows
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += mat[i][j];
                }
                if (rowSum != magicSum) {
                    isMagicSquare = false;
                    break;
                }
            }

            // Check columns
            for (int i = 0; i < n; i++) {
                int colSum = 0;
                for (int j = 0; j < n; j++) {
                    colSum += mat[j][i];
                }
                if (colSum != magicSum) {
                    isMagicSquare = false;
                    break;
                }
            }

            // Check main diagonal
            int diaSum = 0;
            for (int i = 0; i < n; i++) {
                diaSum += mat[i][i];
            }
            if (diaSum != magicSum) {
                isMagicSquare = false;
            }

            // Check anti-diagonal
            int antiDiaSum = 0;
            for (int i = 0; i < n; i++) {
                antiDiaSum += mat[i][n - 1 - i];
            }
            if (antiDiaSum != magicSum) {
                isMagicSquare = false;
            }

            // Final result
            if (isMagicSquare) {
                System.out.println("It is a Magic Square!");
            } else {
                System.out.println("It is NOT a Magic Square.");
            }
        }
    }
}


// Enter a 3x3 matrix:
// 8 
// 8
// 8
// 8
// 8
// 8
// 8
// 8
// 8
// It is a Magic Square!

// Enter a 3x3 matrix:
// 5       
// 5
// 5
// 5
// 5
// 5
// 5
// 5
// 5
// It is a Magic Square!