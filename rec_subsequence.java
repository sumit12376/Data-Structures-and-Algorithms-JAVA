public class rec_subsequence {
    static void getSSQ(String s, String current) {
        if (s.length() == 0) {
            System.out.println(current);
            return;
        }
        char curr = s.charAt(0);
        String remaining = s.substring(1);

 // Include the current character and move to the next
 getSSQ(remaining, current + curr);

        // Exclude the current character and move to the next
        getSSQ(remaining, current);

       
    }

    public static void main(String[] args) {
        String str = "abc";
        getSSQ(str, "");
    }
}
// import java.util.ArrayList;

// public class rec_subsequence {
//     static ArrayList<String> getSSQ(String s) {
//         ArrayList<String> ans = new ArrayList<>();
//         if (s.length() == 0) {
//             ans.add("");
//             return ans;
//         }
//         char curr = s.charAt(0);
//         ArrayList<String> smallans = getSSQ(s.substring(1));
//         for (String ss : smallans) {
//             ans.add(ss);
//             ans.add(curr + ss);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         ArrayList<String> ans = getSSQ("abc");
//         for (String ss : ans) {
//             System.out.println(ss);
//         }
//     }
// } 