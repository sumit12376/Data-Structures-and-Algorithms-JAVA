public class strinPalindromesubstring {
    public static boolean ispalindrome(String str){
    int   i=0;
      int j=str.length()-1;
      boolean flag=true;
      while(i<j){
          if(str.charAt(i)!=str.charAt(j)){
              flag=false;
              break;
  
          }
          else{
            i++;
            j--;
  
          }
      }
    return flag;
}
public static void main(String[] args) {
    String str="abba";
    int count=0;
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
            if(ispalindrome(str.substring(i,j))==true){
                System.out.println(str.substring(i,j));
                count++;
            }
        }
    }
    System.out.println("the number of palindromic substring are"+count);
}
}
