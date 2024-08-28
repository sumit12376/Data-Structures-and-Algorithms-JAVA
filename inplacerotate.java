import java.util.Scanner;

public class inplacerotate {
     static void reverse(int [] a,int i,int j){
    while(i<j)
    {
    
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;

    }
}
    static void inplace(int [] a,int k){
         int n=a.length;
         reverse(a,0,n-k-1);
           reverse(a,n-k,n-1);
             reverse(a,0,n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int p = sc.nextInt();
    
        int[] a = new int[p];
        System.out.println("Enter the elements:");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index after which to reverse the elements:");
        int k = sc.nextInt();
        inplace(a,k);
         for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
         }
        }
    
}
