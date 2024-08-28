import java.util.Stack;

public class stackInfixtoprefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(String.valueOf(ch));
            } else if (op.isEmpty() || ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o + v1 + v2);
                }
                op.pop(); // Remove the '('
            } else {
                if (op.isEmpty() || ch == '+' || ch == '-') {
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        val.push(o + v1 + v2);
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(o + v1 + v2);
        }

        System.out.println("Result: " + val.peek());
    }
}