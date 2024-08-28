public class stack_ll {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        node head=null;
     int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display(){//isse ulta stack print hoga par sab operation sahi chalrha
                        //isliye rev display chalan padega
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x= head.val;
            head=head.next;
            return x;
        }
    void peek(){
        System.out.println("the peek value"+head.val);
        }
    }
    public static void main(String[] args) {
        LLStack st= new LLStack();
        st.push(2);
        st.push(52);
        st.push(26);
        st.push(92);
        st.push(5872);
        st.push(276);
        st.peek();
        st.display();
        System.out.println("after pop the element");
        st.pop();
        st.display();
        st.peek();
        System.out.println("size of stack");
      System.out.println(  st.size());
       
    }
}
