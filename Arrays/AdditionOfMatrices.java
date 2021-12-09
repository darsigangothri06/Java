import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String args[]) {
        int i, j, row, col;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = in.nextInt();
        System.out.print("Enter number of columns: ");
        col = in.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter the elements of matrix 1: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter " + i + "th row and " + j + "th column element: ");
                mat1[i][j] = in.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the elements of matrix 2: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter " + i + "th row and " + j + "th column element: ");
                mat2[i][j] = in.nextInt();
            }
            System.out.println();
        }

        // Adding two matrices and storing in new array
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Resultant matrix is: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}