public class twoswapsort {                  //two swap 
    static void twoswap(int[]a){
        int x=-1;
       int  y=-1;
    for(int i=1;i<a.length;i++){
       
        if(a[i-1]>a[i]){
            if(x==-1){
            x=i-1;
            y=i;
        }
        else{
             y=i;
    }
}} 
int temp=a[x];
a[x]=a[y];
a[y]=temp;
}
    public static void main(String[] args) {
        int[] a = {19,8,10,15,18,7,191};
        twoswap(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}