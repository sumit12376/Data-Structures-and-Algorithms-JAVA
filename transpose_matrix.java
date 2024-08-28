import java.util.Scanner;

public class transpose_matrix {
    static int[][] findtranspose(int[][]matrix,int r,int c){
        int [][] ans=new int[c][r];
         for (int i = 0; i < r; i++) {
               for (int j = 0; j <c; j++) {
                ans[i][j]=matrix[j][i];
    }
}
return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ener row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        for(int i=0;i<r;i++){
         for(int j=0;j<c;j++)   {
            matrix[i][j]=sc.nextInt();
         
         }

           }
              int[][] ans=findtranspose(matrix,r,c);
           System.out.println("Resultant matrix after transpose");
           for (int i = 0; i < r; i++) {
               for (int j = 0; j <c; j++) {
                   System.out.print(ans[i][j] + " ");
               }
               System.out.println();
           }
       }
    
}
