import java.util.Scanner;

public class sum_rec {
    static int sum(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return sum(n / 10) + n % 10; // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Sum of digits: " + sum(n));
      
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
