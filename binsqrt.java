// public class binsqrt {
//     public static void main(String[] args) {
//         int n = 28;
//         int i = 1; 
//         int ans = 0; 

//         while (i * i <= n) {
//             ans = i; 
//             i++; 
//         }

//         System.out.println(ans);
//     }
// }
  //now we use binary search
  public class binsqrt {
    public static void main(String[] args) {
   int n=36;
   int st=0;
   int end=n;
   int ans=0;
    while(st<=end){
        int mid=(st+end)/2;
        if((mid*mid)<=n) {
            ans=mid;
            st=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    System.out.println(ans);
}
  }