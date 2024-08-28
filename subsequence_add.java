public class subsequence_add {
        static void printSubsequences(int[] s,int n,int idx,int sum) {
            if (idx>=n) {
                System.out.println(sum);
                return;
            }
       
            printSubsequences(s,n,idx+1,sum+s[idx]);
            printSubsequences(s,n,idx+1,sum);
        }
    
        public static void main(String[] args) {
            int[] s={2,4,5};
            printSubsequences(s,s.length,0,0);
        }
    }
