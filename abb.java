import java.util.Scanner;

public class abb {
    static void printspiral(int [][]matrix,int r,int c){
   int toprow=0,bottomrpw=r-1,leftcolumn=0,rightcolum=c-1;
   int totoalelement=r*c;
   while (totalelement > 0) {
    //top row
    for(int j=leftcolumn;j<=rightcolum;j++)
    {
        System.out.println(matrix[toprow][j]);
        totalelement--;
    }
    toprow++;
        //bottom row
        for(int j=rightcolum;j>=leftcolum;j--)
        {
            System.out.println(matrix[bottomrow][j]);
            totalelement--;
        }bottomrow--;
          //left col
          for(int j=bottomrow;j>=toprow;j--)
          {
              System.out.println(matrix[j][leftcolum]);
              totalelement--;
          }leftcolum++;
             //rightcol
        for(int j=toprow;j<bottomrow;j--)
        {
            System.out.println(matrix[j][rightcolum]);
            totalelement--;
        }
        rightcolum--;
    }
        
          
   }
    static void print(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of row and col ");
int r=sc.nextInt();
int c=sc.nextInt();
int[][] matrix=new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        matrix[i][j]=sc.nextInt();
    }
    }
    System.out.println("enter the input");
    print(matrix);
    System.out.println("spiral order");
    printspiral(matrix,r,c);
    
}
}