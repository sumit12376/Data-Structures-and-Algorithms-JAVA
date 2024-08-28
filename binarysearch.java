public class binarysearch {
    static int search(int[] a, int target) {
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 7, 8, 9, 22};
        int target = 7;
        System.out.println(search(a, target));
    }
}
//logn