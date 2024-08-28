public class mergesort {
    static void displayarr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void mergeSortalgo(int[] arr, int l, int r) {

        int mid = (l + r) / 2;
        mergeSortalgo(arr, l, mid);
        mergeSortalgo(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
            while (j < n2) {
                arr[k++] = right[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 79, 100, 3, 50, 22, 868, 93939, 2, 5, 3, 5, 3, 3, 3, 6, 6, 6, 78, 2 };
        int r = arr.length;
        mergeSortalgo(arr, 0, r - 1);
        System.out.println("array aftre sorting");
        displayarr(arr);
    }
}
