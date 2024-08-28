import java.util.Scanner;

public class spiral {
    static void printspiral(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcolumn = 0, rightcolumn = c - 1;
        int totalelements = r * c;

        while (totalelements > 0) {
            // Top row
            for (int j = leftcolumn; j <= rightcolumn; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelements--;
            }
            toprow++;
            //righ3
            for (int j = toprow; j <= bottomrow; j++) {
                System.out.print(matrix[j][rightcolumn] + " ");
                totalelements--;
            }
            rightcolumn--;
            // Bottom row
            for (int j = rightcolumn; j >= leftcolumn; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalelements--;
            }
            bottomrow--;

            // Left column
            for (int j = bottomrow; j >= toprow; j--) {
                System.out.print(matrix[j][leftcolumn] + " ");
                totalelements--;
            }
            leftcolumn++;

        
        }
    }

    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix:");
        print(matrix);
        System.out.println("Spiral order:");
        printspiral(matrix, r, c);
    }
}
