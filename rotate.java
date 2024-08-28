import java.util.Scanner;

public class rotate{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();
    
        int[] a = new int[p];
        System.out.println("Enter the elements:");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index after which to reverse the elements:");
        int k = sc.nextInt();
        int n = a.length;
        k = k % n;

        int[] b = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            b[j++] = a[i];
        }

        for (int i = 0; i < n - k; i++) {
            b[j++] = a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
