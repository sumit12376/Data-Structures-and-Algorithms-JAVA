import java.util.*;

public class stack_valid_parantghesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false; // Unmatched closing bracket(opning bracket nhi hai)
                }

                char top = st.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' &&top == '[')) {
                    st.pop(); // Matching pair found
                } else {
                    return false; // Mismatched brackets
                }
            }
        }

        return true; // Check for unmatched opening brackets
    }

    public static void main(String[] args) {
        // Example usage:
     
        String input = "{[()]}()";
        System.out.println(isValid(input)); // Should print true
    }
}


