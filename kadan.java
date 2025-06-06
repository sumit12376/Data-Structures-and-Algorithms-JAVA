public class kadan {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0; // Reset if negative
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(nums)); 
    }
}
