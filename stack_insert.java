import java.util.Stack;
public class stack_insert {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(7);
        System.out.println("Original stack: " + st);
        int idx=2;
        int val=4;
        Stack<Integer>temp = new Stack<>();
        while(st.size()>idx){
        temp.push(st.pop());
        }
            st.push(val);
            while(temp.size()>0){
                st.push(temp.pop());
            }
            System.out.println("Original stack: " + st);
        }
    }