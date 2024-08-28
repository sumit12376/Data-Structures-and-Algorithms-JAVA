import java.util.Stack;

public class stack_sockspan {
    public static void main(String[] args) {
             Stack<Integer> st = new Stack<>();
        int arr[] = {100,80,60,70,60,75,110};
        int res[] = new int[arr.length];
        int n = arr.length;
        res[0]=1;
        st.push(0);

        for(int i =1; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = i+1;}
            else res[i]=i-st.peek();
            st.push(i);
        }


        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
