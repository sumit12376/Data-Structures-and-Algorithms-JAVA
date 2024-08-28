public class binserchunique {
    public static int search(int[] a) {
        int st = 0;
        int end = a.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if ((mid == 0 || a[mid] != a[mid - 1]) && (mid == a.length - 1 || a[mid] != a[mid + 1])) {
                return a[mid];
            } else if (mid % 2 == 0 && a[mid] == a[mid + 1]|| mid % 2 == 1 && a[mid] == a[mid -11]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Return a default value if no unique element is found
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 5, 6, 6, 7, 7};
        int anss = search(a);
        System.out.println(anss);
    }
}
