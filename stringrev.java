import java.util.Scanner;
public class stringrev {
    static String remove_a(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
       return remove_a(s, idx + 1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remove_a(s, 0));
    }
}
