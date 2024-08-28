import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();

        int[] a = new int[p];
        System.out.println("Enter the elements:");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 0; i < p; i++) {
            a[i] = a[i] * a[i];
        }
        int left = 0;
        int right = p - 1;

        while (left<right) {
            if (a[left]<a[right]) {
                int temp =a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }            if (a[left] > a[right]) {
                left++;
            }
                        }            if (a[left] == a[right]) {
                            left++;
                            right--;
                }
        System.out.println("Array after rearranging in non-decreasing order:");
        for (int i = 0; i < p; i++) {
            System.out.println(a[i]);
        }
    }
}
