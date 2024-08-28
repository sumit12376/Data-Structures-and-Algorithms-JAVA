public class insertionsort {
    static void insertion(int[] a) {
     for(int i=1;i<a.length;i++){
        int j=i;
        while(j>0 && a[j]<a[j-1]){
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
     }
        
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 6, 4, 7};
        insertion(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

