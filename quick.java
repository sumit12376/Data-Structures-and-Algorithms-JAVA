public class quick {
    static void qs(int[] a, int l, int r) {
        if (l < r) {
            int pivot = partation(a, l, r);
            qs(a, l, pivot - 1);
            qs(a, pivot + 1, r);
        }
    }

    static int partation(int[] a, int l, int r) {
        int pivot = a[l];
        int i = l + 1;
        int j = r;
        while (i <= j) { // Change condition from i < j to i <= j
            while ( a[i] <= pivot) { // Corrected condition and bounds check
                i++;
            }
            while (a[j] > pivot) { // Corrected condition and bounds check
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] a = { 8, 10, 23, 5, 56, 3, 2, 2, 5, 6, 67, 7, 8, 9, 9777 };
        int r = a.length - 1;
        qs(a, 0, r);
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
