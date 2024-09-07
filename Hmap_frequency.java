import java.util.*;

public class Hmap_frequency {
    public static void main(String[] args) {
        int [] arr={1,4,3,2,3,4,2,234,4,4,4,4,2,2,2};
        HashMap <Integer,Integer>freq=new HashMap<>();
        for(int el:arr){//o(n)
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }

        }
        System.out.println("freqmap");
       System.out.println(freq.entrySet());
       int maxFreq=0;
       int anskey=-1;
    //    for(var e:freq.entrySet()){
    //     if(e.getValue()>maxFreq){
    //         maxFreq=e.getValue();
    //         anskey=e.getKey();
    //     }
    //    }

    for (var key:freq.keySet()){//o(n)
        if(freq.get(key)>maxFreq){
            maxFreq=freq.get(key);
            anskey=key;
        }
    }
       System.out.printf("%d has max greq and its accures %d time",anskey,maxFreq);
    }
}
