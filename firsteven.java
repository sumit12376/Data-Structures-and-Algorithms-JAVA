import java.util.Scanner;

public class firsteven {System
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();

        int[] a = new int[p];
        System.out.println("Enter the elements");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }
        int left=0;
        int right=p-1;
        while(left<right)
            if (a[left]%2==1 && a[right]%2==0)
            {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            if (a[left]%2== 0) {
                left++;
            }
            if (a[right]%2==1) {
                right--;
            }

        System.out.println("Sorted array is:");
        for (int i = 0; i < p; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
