import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_reorder{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n=q.size();
        System.out.println(q);//1 2 3 4 5 6 7 8
        for(int i=0;i<n/2;i++){
          st.push(q.remove());
        }
        while(st.size()>0){
          q.add(st.pop());//5 6 7 8 4 3 2 1
        }
        for(int i=0;i<n/2;i++){
          st.push(q.remove());//4 3 2 1     st=8 7 5 6
        }
        while(st.size()>0){
          q.add(st.pop());//
          q.add(q.remove());
        }
        System.out.println(q);
    
    while(q.size()>0){
        st.push(q.remove());
    }
    while(st.size()>0){
        q.add(st.pop());
    }
    System.out.println("output"+q);
  }}
