// PRINT FIRST NEGATIVE INTEGER 
// N=8;
// A[]=[12,-1,-7,8,-15,30,16,28]
// K=3;
// OP=-1,-1,-7,-15,0;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWindowSize {
    static int[] printFirstNegativeInteger(int a[], int n, int k) {
        Queue<Integer> q = new LinkedList<>();
      int index=0;
      while(index<k){
        if(a[index]<0){
            q.add(a[index]);
        }
        index++;
      }
      int res[]=new int [n-k+1];
      res[0]=(q.isEmpty())?0:q.peek();
      for(int i=1;i<n-k+1;i++){
        if(a[i-1]<0){
            q.remove();
        }
        if(a[i+k-1]<0){
            q.add(a[i+k-1]);
        }
        res[i]=(q.isEmpty())?0:q.peek();
      }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = a.length;
        int k = 3;
        
        int[] result = printFirstNegativeInteger(a, n, k);
        
        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}





// brutforce


// public class FirstNegativeInteger {

//   static void printFirstNegativeInteger(int a[], int n, int k) {
//       for (int i = 0; i <= n - k; i++) {
//           int firstNegative = 0;  // Default to 0 if no negative integer is found
          
//           // Traverse the current window
//           for (int j = i; j < i + k; j++) {
//               if (a[j] < 0) {
//                   firstNegative = a[j];
//                   break;  // Exit loop once the first negative is found
//               }
//           }
          
//           System.out.print(firstNegative + " ");
//       }
//   }

//   public static void main(String[] args) {
//       int[] A = {12, -1, -7, 8, -15, 30, 16, 28};
//       int N = 8;
//       int K = 3;
//       printFirstNegativeInteger(A, N, K);
//   }
// }
