public class selectionsort {
    public static void main(String[] args) {
        int[] a = {3, 2, 5, 32, 2};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if(min!=i){
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
