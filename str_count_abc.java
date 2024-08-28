import java.util.Scanner;

public class str_count_abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=""+str.charAt(0);
       int  count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(prev==curr){
            count++;
            
            }
            else{
                ans=ans+count;
                count=1;
                ans=ans+curr;
            }
        }
        ans=ans+count;

        System.out.println(ans);
    }
}
