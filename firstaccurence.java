public class firstaccurence {   //find the first occurence of a given document x given that given array sorted.if no accurance of x is found then return -1
static int search(int a[],int target){

                int st = 0, end = a.length - 1,fo=-1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (target == a[mid]) {
                fo=mid;
                end=mid-1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return fo;
    }
    

    public static void main(String[] args) {       
        int [] a={2,3,4,4,5,6,6,6,8};
        int target=6;
        System.out.print(search(a,target));
    }
}
