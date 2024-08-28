public class stack_Slidingwindowmax {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,2,3,6};
    int n=arr.length;
    int k=3;
int[] maximum = new int[n-k+1];

   
    for(int i=0;i<n-k+1;i++){
      int max=0;
        for(int j=i;j<i+k;j++){
       max=Math.max(max, arr[j]);
        }
 maximum[i]=max;
    }

for(int i=0;i<maximum.length;i++)    {
    System.out.println(maximum[i]);
}
}}



//stack se tough hai per queue se ho jayega
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         Deque<Integer> q = new ArrayDeque<>();
//         int n = nums.length;
//         int[] res = new int[n - k + 1];
//         int index = 0;
//         while (index < k) {
//             while (!q.isEmpty() && nums[q.peekLast()] <= nums[index]) {
//                 q.pollLast();  
//             }
//             q.addLast(index); 
//             index++;
//         }
//      res[0] = nums[q.peekFirst()]; 
//      for (int i = 1; i <= n - k; i++) {
//         if (!q.isEmpty() && q.peekFirst() <= i-1) {
//                 q.pollFirst(); 
//             }
//              while (!q.isEmpty() && nums[q.peekLast()] <= nums[i + k - 1]) {
//                 q.pollLast();
//             }
//              q.addLast(i + k - 1);
//             res[i] = nums[q.peekFirst()];
//         }

//         return res;
//     }
// }