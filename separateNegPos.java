public class separateNegPos {
    public static void separate(int[] a) {
        int n = a.length;
        int left = 0; // Index for negative numbers
        int right = n - 1; // Index for positive numbers

        while (left < right) {
            // Find the first positive number from the left
            while (a[left] < 0) {
                left++;
            }
            // Find the first negative number from the right
            while ( a[right] >= 0) {
                right--;
            }

            if (left < right) {
                // Swap the positive and negative numbers
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 8, -10, 23, -5, 56, -3, 2, -2, 5, 6, -67, 7, 8, 9, -9777 };
        separate(a);

        System.out.print("Separated array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
