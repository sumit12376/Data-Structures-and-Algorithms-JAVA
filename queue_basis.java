import java.util.LinkedList;
import java.util.Queue;

public class queue_basis {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(4);
        q.add(6);
        q.add(42);
        q.add(42);
        q.add(423);
        q.add(4112);
        q.add(442);
        System.out.println(q);
        q.remove();
        System.out.println(q);
      
        System.out.println(  q.peek());
        System.out.println(  q.poll());
        System.out.println(q.size());
    }
}
