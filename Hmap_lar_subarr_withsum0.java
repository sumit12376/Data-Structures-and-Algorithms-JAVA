import java.util.HashMap;

public class Hmap_lar_subarr_withsum0 {
    public static int result(int arr[]){
        int maxlen=0;
        int prefsum=0;
        HashMap <Integer,Integer>mp=new HashMap<>();
       mp.put(0,-1);
        for (int i=0;i<arr.length;i++){
            prefsum +=arr[i];
            if(mp.containsKey(prefsum)){
                int length=i-mp.get(prefsum);
               maxlen=Math.max(maxlen, length);
            }
            else{
                mp.put(prefsum,i);
            }
        }
        return maxlen;
    }
   
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10,-25};
        System.out.println("Length of the largest subarray with sum 0 is " + result(arr));
   }
}
