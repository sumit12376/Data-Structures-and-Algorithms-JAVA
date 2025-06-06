// import java.util.*;

import java.util.Arrays;

public class FreqArr{
    public static void main(String[] args){
        // int [] arr={9,1,12,12,12,12,4,4,4,4,4,4,4,4,1,1,1,2,2};
    
        // HashMap<Integer,Integer>mp=new HashMap<>();
        // for( int num : arr){
        //     mp.put(num , mp.getOrDefault(num,0) +1 );
        // }
        // System.out.println(mp.values());
        
        int[] a = new int[5];  // Correct size
        int[] arr = {1, 8, 33, 9, 9};

        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] >= 9) {
                a[i] = 0;
            } else {
                a[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < a.length; i++) { 
        System.out.print(a[i]+" ");
        }
    }
}