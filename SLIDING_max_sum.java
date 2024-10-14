public class SLIDING_max_sum {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {100, 200, 300, 400,600};
        int n = arr.length; 
        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;
        for (int i = 1; i <n-k+1; i++) {
            currentSum = currentSum - arr[i-1] + arr[i+k-1];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}
