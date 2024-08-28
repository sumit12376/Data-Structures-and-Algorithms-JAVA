public class binary_recursion {
    static boolean binary(int a[],int target,int st,int end){
        if(st>end)return false;
        int mid=(st+end)/2;
        if(target==a[mid]){
            return true;
        }
            else if(target<a[mid]){
                return binary(a,target,st,mid-1);
            }
            else {
                return binary(a, target,mid+1,end);
            }
        }

    
    public static void main(String[] args) {
        int a[] ={2,3,4,5,1};
        int target=5;
        int st=0;
        int end=a.length-1;
       System.out.println(binary(a,target,st,end));
    }
    
}

