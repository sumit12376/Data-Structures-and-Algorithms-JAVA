import java.util.HashMap;

public class HmapIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            char cht = s.charAt(i);
            if (!mp.containsKey(chs)) {
                if (!mp.containsValue(cht)) {
                    mp.put(chs, cht);

                } else {
                    return false;
                }
            } else {
                if (mp.get(chs) != cht)
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "edd";
        String t = "acc";

        if (isIsomorphic(s, t)) {
            System.out.println(s + " and " + t + " isomorpic.");
        } else {
            System.out.println(s + " and " + t + " not isomorphic");
        }
    }
}
