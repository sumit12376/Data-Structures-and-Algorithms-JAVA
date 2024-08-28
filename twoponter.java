import java.util.Scanner;

public class twoponter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();

        int[] a = new int[p];
        System.out.println("Enter the elements (0s and 1s only):");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[p];
        int left = 0;
        int right = p - 1;

        for (int i = 0; i < p; i++) {
            if (a[i] == 0) {
                b[left] = 0;
                left++;
            } else {
                b[right] = 1;
                right--;
            }
        }

        System.out.println("Sorted array is:");
        for (int i = 0; i < p; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
