// import java.util.HashSet;

// public class Hset {
//     public static void main(String[] args) {
//         HashSet<String>st=new HashSet<>();
//         st.add("sumit");
//         st.add("sumit");
//         st.add("rahull");
        
//         System.out.println(st);//[rahull, sumit]
//         System.out.println(st.contains("james"));//false
//         System.out.println(st.size());//2
//         st.remove("sumit");
//         System.out.println(st);//[rahull]
//         System.out.println(st.contains("sumit"));//false
//         for(var s : st){
//             System.out.println(s);//rahull
//         }
//     }
// }




// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.


import java.util.HashSet;

public class Hset {
    public static void main(String[] args) {
   HashSet<Integer>st=new HashSet<>();
    int a[]={2,3,4,119,5,1,6,66,76,111,112,113,114,115,116,117,118};
    int max=0;
       for(int num :a) {
        st.add(num); 
       }
       for (int num:st){
        if(!st.contains(num-1)){
            int currnum=num;
            int count=1;
            while(st.contains(currnum+1)){
                count++;
                currnum++;
            }
            max=Math.max(max,count);
        }
       }
       System.out.println(max);
    }
}