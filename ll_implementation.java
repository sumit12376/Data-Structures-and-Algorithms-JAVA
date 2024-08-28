public class ll_implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertBetween(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int count() {
            Node curr = head;
            int count = 0;
            while (curr != null) {
                count++;
                curr = curr.next;
            }
            return count;
        }

        int getValueAtIndex(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else {
                head = head.next;
            }
        }

        void deleteLast() {
            Node secondLastNode = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                secondLastNode = secondLastNode.next;
                lastNode = lastNode.next;
            }
            secondLastNode.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(45);
        ll.insertAtEnd(55);
        ll.insertAtEnd(4);
        ll.insertAtBeginning(599);
        ll.insertAtBeginning(5);
        ll.insertAtBeginning(765);
        // ll.insertBetween(2, 1000);

        System.out.println("Count of nodes: " + ll.count());
        ll.display();
        System.out.println("The tail is " + ll.tail.data);
        System.out.println("The value at index 3: " + ll.getValueAtIndex(3));

        ll.deleteFirst();
        ll.deleteLast();
        ll.display();
    }
}
