import java.util.Stack;

public class Stack_posttopre {
    public static void main(String[] args) {
         String str="953+4*6/-";      //String str="-9/*+5346";
        Stack <String> val=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        int ascii=(int)(ch);
        if(ascii>=48&&ascii<=57){
            val.push(ch+"");
        }
        else{
            String v2=val.pop();
            String v1=val.pop();
            // String t=ch+v1+v2;//postfix to prefix
            String t=v1+ch+v2;////postfix to infix
            val.push("("+t+")");
        }
    }
    System.out.println(val.peek());
}
}