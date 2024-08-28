public class binpeakindex {
    public static int peak(int []a){
        int st=0;
        int end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid = st + (end - st) / 2;
            if (a[mid]<a[mid+1]){
             ans=mid+1;
             st=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] a = {2,4,10,7,3,1,0};
        int anss=peak(a); // Output: 3
        System.out.println(a[anss]);
    }
}


