
    import java.util.Scanner;

    public class prifnomorearr {
        static int[] prefixSum(int[] a) {
            for (int i = 1; i < a.length; i++) { 
                a[i] = a[i] + a[i - 1];
            }
           return a;
        
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE SIZE OF ARRAY: ");
            int s = sc.nextInt();
            int[] a = new int[s];
            System.out.println("ENTER THE ELEMENTS TO INSERT IN ARRAY:");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int [] pref= prefixSum(a); // Call the prefixSum function to calculate the prefix sum
            System.out.println("THE RESULT IS:");
            for (int i = 0; i < a.length; i++) {
                System.out.println(pref[i]);
            }
        }
    }
    
