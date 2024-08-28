import java.util.Scanner;
public class binaryserchtwod {
    public static boolean searchMatrix(int[][] a, int target) {
        int n = a.length;
        int m = a[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            int midelement = a[mid / m][mid % m];
            if (midelement == target) {
                return true;
            } else if (target < midelement) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a[][]=new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int target = 5;
        System.out.println(searchMatrix(a, target));
    }
}
