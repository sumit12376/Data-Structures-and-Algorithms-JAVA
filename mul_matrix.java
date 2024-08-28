import java.util.Scanner;

public class mul_matrix {
    static void mulMatrix(int[][] a, int n, int m, int[][] b, int l, int o) {
        if (m != l) {
            System.out.println("Enter right dimensions");
            return;
        }

        int[][] c = new int[n][o];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < o; j++) {
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < o; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first matrix row");
        int n = sc.nextInt();
        System.out.println("Enter the size of the first matrix column");
        int m = sc.nextInt();
        System.out.println("Enter the size of the second matrix row");
        int l = sc.nextInt();
        System.out.println("Enter the size of the second matrix column");
        int o = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[l][o];

        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < o; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        mulMatrix(a, n, m, b, l, o);
    }
}
