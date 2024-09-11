import java.util.HashMap;

public class HmapValidAnagram {
    
    // Method to create frequency map
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }
    
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
    
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        
        if (isAnagram(s, t)) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
    }
}
