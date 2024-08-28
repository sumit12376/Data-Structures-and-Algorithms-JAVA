// 
//     public static void main(String[] args) {
//         int arr []={1,3,2,1,8,6,2,4};
//         int res []=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>arr[i]){
//                 res[i]=arr[j];
//                 break;
//             }
//         }}
//         for(int i=0;i<res.length;i++){
//             System.out.println(res[i]);
//     }

//     }public class stack_nextgrater  {
// }
// tc=o(n)2
 
// using stack

import java.util.Stack;

public class stack_nextgrater  {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {1, 5, 5, 3, 3, 2, 4, 5, 5, 5, 5};
        int res[] = new int[arr.length];
        int n = arr.length;
        res[n-1] = -1;
    
        st.push(arr[n-1]);

        for(int i = n-2; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }


        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}

