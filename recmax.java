class recmax{
    static int printArray(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];
        int r = printArray(arr, idx + 1);
        return Math.max(arr[idx], r);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 2, 5 };
        System.out.println(printArray(arr, 0));
    }
}
