import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String args[]) {
        int row, col, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = in.nextInt();
        System.out.print("Enter number of columns: ");
        col = in.nextInt();

        int mat[][] = new int[row][col];
        System.out.println("Enter elements of matrix: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("Transpose of your matrix is: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
