import java.util.Scanner;

public class rectanglesum {
    
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
        System.out.println("Enter the l1 coordinate:");
        int l1 = sc.nextInt();
        System.out.println("Enter the r1 coordinate:");
        int r1 = sc.nextInt();
        System.out.println("Enter the l2 coordinate:");
        int l2 = sc.nextInt();
        System.out.println("Enter the r2 coordinate:");
        int r2 = sc.nextInt();
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of the rectangle within the specified coordinates: " + sum);
    }
}
