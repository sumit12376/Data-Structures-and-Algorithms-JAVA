import java.util.Scanner;

public class stringtoggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        //PHysiCs->phYSIcS
        for(int i=0;i<str.length();i++){
            // P->P
            //chaeck alphabt is small or capitol
            boolean flag=true;//true->capitol
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97) flag=false; //small
              if(flag==true){//capitol
                ascii+=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);

              }
              else{
                ascii -=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);

              }
        }
        System.out.println(str);
    }
}
