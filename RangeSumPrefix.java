import java.util.Scanner;

public class RangeSumPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("ENTER THE ELEMENTS TO INSERT IN ARRAY:");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
    
           
            for (int j = 1; j<a.length; j++) {
                
                    a[j] = a[j] + a[j- 1];
            }
            System.out.println("enter query");
                    int q = sc.nextInt();
                    while(q-- >0)
                    {
                             System.out.println("Enter the location of the first element:");
        int l = sc.nextInt();
        System.out.println("Enter the location of the last element:");
        int r = sc.nextInt();
        int ans=a[r]-a[l-1];
        System.out.println(ans);
                    }
      
    }
}
