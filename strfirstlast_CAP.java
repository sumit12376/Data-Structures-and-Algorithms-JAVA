import java.util.Scanner;

public class strfirstlast_CAP {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringBuilder sb=new StringBuilder(str);
for(int i=0;i<str.length();i++){
    if(i==0||i==str.length()-1&&str.charAt(i)>=97){
        sb.setCharAt(i,(char)((int)str.charAt(i)-32));

    }
    else if(str.charAt(i)==(' ')){
        if(((int)str.charAt(i-1)-32)>=65){
sb.setCharAt(i-1,(char)((int)str.charAt(i-1)-32));
if(((int)str.charAt(i+1)-32)>=65){
    sb.setCharAt(i+1,(char)((int)str.charAt(i+1)-32) );

        }
    }
}
}
System.out.print(sb);
   
}
}
