import java.util.Arrays;

public class chocolatedistrSlidingwin {
    static int chocklectdistribution(int a[],int m,int n){
        int res = Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i<n-m+1;i++){
            int min=a[i];
            int max=a[i+m-1];
             res=Math.min(res,max-min);

        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={3,4,1,9,56,7,9,12};
        int n=a.length;
       int  m=5;
        int result=chocklectdistribution(a,m,n);
        System.out.println(result);
    }
}
