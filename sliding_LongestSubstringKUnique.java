// import java.util.*;
// public class sliding_LongestSubstringKUnique {

//  public static int longestSubstringWithKUniqueChars(String s,int k){
//     int maxLength = 0;
//     String longestSubstring = "";
// for(int i=0;i<s.length();i++){
// for(int j=i;j<s.length();j++){
//     String substringg=s.substring(i,j+1);
//     if(hasuniquechar(substringg,k )){
//         if(substringg.length()>maxLength){
//             maxLength = substringg.length();
//             longestSubstring = substringg;
//         }
//     }
// }
// }
// return maxLength;
//     }
//     public static boolean hasuniquechar(String subStringg,int k){
//         HashSet<Character> uniqueChars = new HashSet<>();
//         for(int i=0;i<subStringg.length();i++){
//             uniqueChars.add(subStringg.charAt(i)); 
//         }
//         return uniqueChars.size()==k;
//     }
//     public static void main(String[] args) {
//         String s = "aabacbebebe";
//         int K = 3;

//         int result = longestSubstringWithKUniqueChars(s, K);
//         System.out.println("Longest substring with " + K + " unique characters: " + result);
//     }
//     }



import java.util.HashMap;

public class sliding_LongestSubstringKUnique {
    public int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0; // Left pointer
        int j = 0; // Right pointer
        int max = -1; // Maximum length
        int n = s.length();

        while (j < n) {
            char ch = s.charAt(j);
            // Add current character to the map
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            // If the map size exceeds k, shrink the window from the left
            if(map.size()>k){
            while (map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++; // Move left pointer
            }
        }
            // Update max length if we have exactly k distinct characters
            if (map.size() == k) {
                max = Math.max(max, j - i + 1);
            }
            j++; // Move right pointer
        }
        
        return max; // Return the maximum length found
    }

    public static void main(String[] args) {
        sliding_LongestSubstringKUnique solution = new sliding_LongestSubstringKUnique();
        
        String s = "aabacbebebe";
        int K = 3;
        
        int result = solution.longestkSubstr(s, K);
        System.out.println("Longest substring with " + K + " unique characters: " + result);
    }
}
