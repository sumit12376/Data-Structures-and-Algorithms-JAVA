public class sort012 {
    public static void main(String[] args) {
        int []a={2,1,1,0,2,1};                  //only 0 and once
        int l=0;
        int mid=0;
        int h=a.length-1;
        while(mid<=h){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[l];
                a[l]=temp;
                l++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
            int temp=a[mid];
            a[mid]=a[h];
            a[h]=temp;
            h--;
        }
    }
        for ( int i : a) {
          System.out.println(i+" ");  
        
    }
}
}