public class armstron {
    static int arm(int num) {
        int n = num; // Corrected variable name
        int l = ("" + n).length();
        if (n < 10) {
            return (int) Math.pow(10, l); // Corrected base for exponentiation
        }
        return arm(n / 10) + arm(n % 10);
    }

    public static void main(String[] args) {
        int num = 153;
        int r = arm(num);
        System.out.println("The gcd of given number " + r);

    }
}
