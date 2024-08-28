public class queue_arrayimpli {
    public static class QueueArray{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int [100];
        public  void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if (size == 0) {
                f = 0;
            }
            arr[++r]=val;
            size++;
        }
        public int remove(){
        if(size==0){
            System.out.println("queue is empty");
            return-1;
        }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            return arr[f];
        }
        public void display(){
            if (size==0){
                System.out.println("empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println("");
        }
   
    }

    public static void main(String[] args) {
        QueueArray q=new QueueArray();
        q.display();
        q.add(1);
        q.add(13);
        q.add(122);
        q.add(11);
        q.add(1221);
        q.add(31);
       q.display();
       q.add(111111);
       q.display();
       
       
       System.out.println(q.peek());
    }
}
