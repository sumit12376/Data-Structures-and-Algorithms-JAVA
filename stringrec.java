import java.util.Scanner;
public class stringrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        char ch = s.charAt(3); 
        System.out.println(ch);
        System.out.println("hello");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            System.out.println(s.substring(2,5));
        }
    }
}