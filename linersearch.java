public class linersearch {
    static int searc(int[] arr, int target,int idx) {
        if (idx == arr.length - 1)
            return -1;
            if(arr[idx]==target) return idx;
        return searc(arr,target,idx + 1);
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 2, 5 };
      int   target=53;
        int result=searc(arr,target,0);
        System.out.println(result);
    }
}

