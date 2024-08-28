// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;
// public class queue_rev { 
//     public static void main(String[] args) {
        

//           Queue<Integer> q = new LinkedList<>();
//           Stack<Integer> st=new Stack<>();
//         q.add(3);
//         q.add(424);
//         q.add(41);
//         q.add(44);
//         q.add(45);
//         while(q.size()>0){
//             st.push(q.remove());
//         }
//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         System.out.println(q);
//     }

// }



//revese first k element
// i/p=12345 k=3 o/p=32145
import java.util.*;
public class queue_rev { 
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int k=3;
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}






























// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.*;
// public class queue_rev { 
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         Stack<Integer> st=new Stack<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         int k=3;
//         for(int i=0;i<k;i++){
//             st.push(q.remove());
//         }
//         for(int j=0;j<k;j++){
//             q.add(st.pop());
//         }
//         System.out.println(q);
//     }
// }
        
