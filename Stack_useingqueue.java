import java.util.LinkedList;
import java.util.Queue;

public class Stack_useingqueue {
        Queue<Integer> q1=new LinkedList<>();
        public  void push(int val){
            q1.add(val);
        }
        public  int peek(){
            for (int i = 0; i < q1.size() - 1; i++) {
                q1.add(q1.remove());
            }
            int x=q1.peek();
            q1.add(q1.remove());    
            return x;
        }
        public int pop() {
            for (int i = 0; i < q1.size() - 1; i++) {
                q1.add(q1.remove());
            }
            return q1.remove();
        }
        public void display(){
            System.out.println(q1);
        }
        public static void main(String[] args) {
            Stack_useingqueue stack = new Stack_useingqueue();
            stack.push(10);
            stack.push(20);
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.display();
            stack.pop();
            stack.display();

        System.out.println(stack.peek());
        stack.push(60);
        stack.display();
        System.out.println(stack.peek());
        }
    }