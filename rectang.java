import java.util.Scanner;

public class rectang {
    
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
        //     int r=matrix.length;
        //    int c=matrix[0].lenght;
           for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
           }
              System.out.println("Updated matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
System.out.println("enter l1");
       int l1=sc.nextInt();
       System.out.println("enter l2");

       int l2=sc.nextInt();
       System.out.println("enter r1");

       int r1=sc.nextInt();
       System.out.println("enter r2");
int r2=sc.nextInt();
     int  sum=0;
        for(int i=l1;i<=l2;i++){
            sum +=matrix[i][r2]-matrix[i][r1-1];
        
 }
System.out.println("the sum is " + sum);

        }
}
