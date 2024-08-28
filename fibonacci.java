import java.util.Scanner;
public class fibonacci {
    static int fibo(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    int prev=fibo(n-1);
    int prevprev=fibo(n-2);
    return prev+prevprev;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    // int n = sc.nextInt();
    // int result = fibo(n);
    for(int i=0;i<10;i++){
    System.out.println(fibo(i));
    }
    // System.out.println("Factorial of " + n + " is: " + result);
}
}
