public class strREVechWORD {
    public static void main(String[] args) {
        String ans="";
        String str="I am sumit vikram";
        StringBuilder sb=new StringBuilder("");
        // for(int i = str.length() - 1; i >= 0; i--){
        for(int i = 0; i < str.length() ; i++)
{
            char ch=str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0,sb.length());

            }
        }
        System.out.print(ans);
        System.out.println(sb.reverse());

    }
}
