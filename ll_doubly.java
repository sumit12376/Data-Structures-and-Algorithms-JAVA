public class ll_doubly {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
System.out.print(temp.val+" ");
temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
      
        Node temp=tail;
        while(temp!=null){
System.out.print(temp.val+" ");
temp=temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp =random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
   
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node insertAtBeginning(Node head){
        Node t=new Node(230);
        t.next=head;
        head.prev=t;
        head=t;
        return t;
    }
    public static void insertAtLast(Node head){
        Node t=new Node(230);
        Node temp=head;
        while(temp.next!=null){
           temp=temp.next ;
        }
        temp.next=t;
        t.prev=temp;
      
    }
    public static void insertAtAnyindex(Node head,int idx){
        Node t=new Node(230);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
        temp=temp.next;
        }
      temp.next.prev=t;
      t.prev=temp;
      t.next=temp.next;
      temp.next=t;
    
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(66);
        Node c=new Node(40);
        Node d=new Node(14);
        Node e=new Node(114);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
         display(a);
        // displayrev(e);
        // display2(c);
      //  Node newniNode=insertAtBeginning(a);
        //display(newniNode);
//    insertAtLast(a);
//         display(a);
        insertAtAnyindex(a,2);
        display(a);
    }
}
