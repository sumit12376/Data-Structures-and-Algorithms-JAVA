public class countsort {
    static int findmax(int[] a) {

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mx) {
                mx = a[i];
            }
        }
        return mx;
    }

    static void cousort(int[] a) {// 2,3,2,4
        int max = findmax(a);
        int[] count = new int[max + 1];
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        // int k=0;                           //we use this but stability not ahave
        // for (int i=0;i<count.length;i++){
        // for(int j=0;j<count[i];j++){
        // a[k++]=i;
        // }
        for (int n = 1; n < count.length; n++) {

            count[n] += count[n - 1];
        }
        for (int m = a.length - 1; m >= 0; m--) {
            int idx = count[a[m]]-1;
            output[idx] = a[m];
            count[a[m]]--;
        }
        for (int l = 0; l < output.length; l++) {
            a[l] = output[l];
        }
    }

    public static void main(String[] args) {
        int[] a = { 8, 1, 3, 55555, 688888};

        cousort(a);
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
