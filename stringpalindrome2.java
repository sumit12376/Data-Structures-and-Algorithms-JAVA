import java.util.*;

public class stringpalindrome2 {
       public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        String gtr="abba";
        StringBuilder str=new StringBuilder(gtr);

        str.reverse();
        String s=str.toString();
        if(gtr.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
}
}
// public class stringpalindrome2 {
//  public static void main(String[] args) {
//     String str="abcba";
//   int   i=0;
//     int j=str.length()-1;
//     boolean flag=true;
//     while(i<j){
//         if(str.charAt(i)!=str.charAt(j)){
//             flag=false;
//             break;

//         }
//         else{
//           i++;
//           j--;

//         }
//     }
//    if(flag==true){
//     System.out.println("it is pa;indrome");
//    }
//    else{
//     System.out.println("not a palindrome");
//    }
// }
// }


