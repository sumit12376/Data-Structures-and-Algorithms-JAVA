public class ll_implimentation2 {
    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        node head;

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();  // For better readability
        }

        void insertBetween(int idx, int val) {
            node t = new node(val);
            node temp = head;

            for (int i = 0; i < idx - 1; i++) {
               
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        node a = new node(5);
        node b = new node(6);
        node c = new node(5333);
        node d = new node(56);
        node e = new node(577);

        ll.head = a;  // Set the head of the linked list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ll.display();

        ll.insertBetween(3, 1000);
        ll.display();
    }
}
