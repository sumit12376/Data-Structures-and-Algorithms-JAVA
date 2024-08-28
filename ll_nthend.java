public class ll_nthend {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node NthNode(Node head, int n) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int target = length - n + 1;
        temp = head;
        for (int i = 0; i < target - 1; i++) {
            temp = temp.next;
        }

        return temp;
    }
    //ANOTHER METHOD
    public static Node NthNode2(Node head, int n) {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    } 
    //delete nth node
    public static Node NthNodedelete(Node head, int n) {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
      slow.next=slow.next.next;
      return head;
    } 
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();  // For better readability
    }



    public static void main(String[] args) {
        Node node1 = new Node(100);
        Node node2 = new Node(13);
        Node node3 = new Node(5);
        Node node4 = new Node(12);
        Node node5 = new Node(10);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node result = NthNode(node1, 2);
        System.out.println("Data of the nth node from the end: " + result.data);
        Node r = NthNode2(node1, 2);
        System.out.println("Data of the nth node from the end: " + result.data);
        display(node1);
       node1= NthNodedelete(node1,2);
        display(node1);
        
    }
}
