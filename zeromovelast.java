public class zeromovelast {
    static void move(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] == 0 && a[j + 1] != 0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 0, 2, 0, 1};
        move(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
