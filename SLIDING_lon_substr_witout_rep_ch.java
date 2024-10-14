import java.util.HashSet;

public class SLIDING_lon_substr_witout_rep_ch {
 
        public static int findmax(String s){
            HashSet<Character> mp=new HashSet<>();
        int i=0;
        int j=0;
        int max=-1;
        int n=s.length();
       while(j<n){
        char ch=s.charAt(j);
        if(mp.contains(ch)){
            while(i<j){
                mp.remove(s.charAt(i));
                i++;
            }
            
        }
        else {
      mp.add(ch);
        max=Math.max(max,j-i+1);
        j++;
        }
       }
       return max;
        }
       
    
    public static void main(String[] args) {
        String s = "abcdcdea"; // Replace with your input string
        int maxLength = findmax(s);
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
    }
}
