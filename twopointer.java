import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();

        int[] a = new int[p];
        System.out.println("Enter the elements (0s and 1s only):");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = p - 1;
        
        while (left < right) {
            if (a[left] == 1 && a[right] == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            if (a[left] == 0) {
                left++;
            }
            if (a[right] == 1) {
                right--;
            }
        }

        System.out.println("Sorted array is:");
        for (int i = 0; i < p; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
