import java.util.Scanner;

public class recursion {
    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
