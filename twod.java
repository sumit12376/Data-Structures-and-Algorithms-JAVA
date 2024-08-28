import java.util.Scanner;
public class twod{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       int[][]a=new int[4][3];
       System.out.print("enter the array");
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {
         a[i][j] = sc.nextInt();
        }
       }
      for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {
              System.out.print(a[i][j] );
        }
        System.out.println();
      }
}}
