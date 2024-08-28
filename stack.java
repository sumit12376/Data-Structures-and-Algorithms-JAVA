import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}