public class rec_frog {
    static int best(int[] h, int n, int idx) {
        if (idx == n - 1) return 0;
        if (idx == n - 2) return Math.abs(h[idx] - h[idx + 1]);
        int op1 =  best(h, n, idx + 1)+Math.abs(h[idx] - h[idx + 1]) ;
        int op2 = best(h, n, idx + 2)+Math.abs(h[idx] - h[idx + 2]) ;
        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        int[] h = {10, 30, 40,20};
        System.out.println("The minimum cost to reach the end of the array is " + best(h, h.length, 0));
    }
}
