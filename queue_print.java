import java.util.LinkedList;
import java.util.Queue;

public class queue_print {// witout using sout(q)
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();
        q.add(5);
        q.add(85);
        q.add(50);
        q.add(795);
        q.add(500);
        q.add(95);
        while (q.size() > 0) {
            System.out.println(q.peek());
            r.add(q.remove());
        }
        while (r.size() > 0) {

            q.add(r.remove());
        }
    }
}
