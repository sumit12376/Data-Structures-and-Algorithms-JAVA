import java.util.Stack;

public class StackCopyExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(7);
        System.out.println("Original stack: " + st);
        // Copy elements from st to rt
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()) {
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println("Copied stack (rt): " + rt);

        // Copy elements from rt to lt
        Stack<Integer> lt = new Stack<>();
        while (!rt.isEmpty()) {
            int x = rt.peek();
            lt.push(x);
            rt.pop();
        }

       
       
        System.out.println("Copied stack (lt): " + lt);
    }
}
