import java.util.Scanner;

public class factorial {
    static int factoriala(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factoriala(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factoriala(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
