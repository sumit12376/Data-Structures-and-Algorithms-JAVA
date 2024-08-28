public class subsq_imp {
        static void printSubsequences(String s, String currAns) {
            if (s.length() == 0) {
                System.out.println(currAns);
                return;
            }
            char curr = s.charAt(0);
            String remain = s.substring(1);
            printSubsequences(remain, currAns + curr);
            printSubsequences(remain, currAns);
        }
    
        public static void main(String[] args) {
            printSubsequences("abc", "");
        }
    }
