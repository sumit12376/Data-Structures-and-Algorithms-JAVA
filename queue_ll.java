public class queue_ll {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            {
     return head.val;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            {
     int x=head.val;
     head=head.next;
     size--;
     return x;
            }
        }
        public void display() {
            Node temper = head;
            while (temper != null) {
                System.out.print(temper.val+" ");
                temper = temper.next;
            }
            System.out.println();
        }
        public void size(){
            System.out.println(size);
        }
    } 
        public static void main(String[] args) {
            queueLL ll=new queueLL();
            ll.add(4);
            ll.add(43);
            ll.add(24);
            ll.add(2243);

            ll.display();
            System.out.println("the peek element is"+ll.peek());
            ll.remove();
            ll.display();
            ll.size();
        
    }
}