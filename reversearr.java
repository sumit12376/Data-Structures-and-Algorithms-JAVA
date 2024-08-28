import java.util.Scanner;
class reversearr {
    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int j=0; // Fixed the array creation
        for (int i = a.length - 1;i >0; i--) { // Fixed the loop conditions
            b[j++] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fixed 'scanner' to 'Scanner' and 'system' to 'System'
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n]; // Simplified array initialization
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) { // Fixed loop condition
            a[i] = sc.nextInt();
        }

        int[] reversedArray = reverse(a); // Capture the reversed array
        System.out.print("After reversing the array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}