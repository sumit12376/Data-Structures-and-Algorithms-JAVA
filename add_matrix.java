import java.util.Scanner;

public class add_matrix {

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

        if (n != l || m != o) {
            System.out.println("Enter a valid dimension");
        } else {
            int[][] a = new int[n][m];
            int[][] b = new int[l][o];
            int[][] c = new int[n][m];

            System.out.println("Enter the elements of the first matrix");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Matrix addition
            System.out.println("Resultant matrix after addition:");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

