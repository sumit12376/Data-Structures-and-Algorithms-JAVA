import java.util.Scanner;

public class addsub {
    static int adsub(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return adsub(n - 1) - n;
        }
        if (n % 2 != 0) {
            return adsub(n - 1) + n;
        }
        return 0; // Added a default return statement
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = adsub(n);
        System.out.println("Result of the operation is: " + result);
    }
}
