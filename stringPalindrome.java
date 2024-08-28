import java.util.Scanner;

public class stringPalindrome {
    static String remove_a(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        return remove_a(s, idx + 1) + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = remove_a(s, 0);
        if (rev.equals(s)) {
            System.out.printf("%s is a palindrome%n", s);
        } else {
            System.out.printf("%s is not a palindrome%n", s);
        }
    }
}
