
    import java.util.*;

    public class stackcoubracuncl { 
    public static int isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    count++;
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        // Add remaining unmatched opening brackets to the count
    count += st.size();
    System.out.println(st);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}


