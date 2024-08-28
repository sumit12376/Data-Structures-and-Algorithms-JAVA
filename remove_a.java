import java.util.Scanner;

public class  remove_a{
    static String remove_a(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallans = remove_a(s, idx + 1);
        char currchar = s.charAt(idx);
        if (currchar != 'a') {
            return currchar + smallans;
        } else {
            return smallans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remove_a(s, 0));
    }
}
