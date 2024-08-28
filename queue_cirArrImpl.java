public class queue_cirArrImpl {
    public static class QueueArray {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[5];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("queue is full");
                return;
            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        public void remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
               
            }

          
            if (f == arr.length - 1) {
                f = 0;
            } else {
                f++;
            }
            size--;
           
        }

        public int peek() {
            return arr[f];
        }

        public void display() {
            if (size == 0) {
                System.out.println("empty");
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else if (r < f) {
                for (int i = f; i <= arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        q.display();
        System.out.println("how actual array");
     for(int i=0;i<q.arr.length;i++){
        System.out.print(q.arr[i] + " ");

     }
     

        System.out.println(q.peek());
    }
}
//queue is simple in circular for ll(point tail.next to head)
