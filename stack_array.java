public class stack_array {
    public static class stack{
        int [] arr=new int[40];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        void peek(){
        if(idx==0){
            System.out.println("stack is empty");
       
        }
        else{
            System.out.println("the peek element is:"+arr[idx-1]);
        }
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;  
            }
            else{
                int top=arr[idx-1];
                arr[idx-1]=0;
                idx--;
                return top;
            }
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        stack st= new stack();
        st.push(2);
        st.push(52); 
        st.push(26);
        st.push(92);
        st.push(5872);
        st.push(276);
        st.display();
        System.out.println("after pop the element");
        st.pop();
        st.display();
        st.peek();
        System.out.println("size of stack");
      System.out.println(  st.size());
       
    }
}
