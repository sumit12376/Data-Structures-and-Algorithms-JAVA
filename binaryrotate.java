//a rotated sorted aray is sorted array on which rotation operation has been performed some number of time.given a rotated sorted arrayfind 
//index of the minimum element in araay. all the element is unique
//arr={3,4,5,1,2} output =3;
public class binaryrotate {
    static int minIndex(int[] a) {
        int st = 0;
        int end = a.length - 1;
        int ans = -1;
        while (st <=end) {
            int mid = (st + end) / 2;
            if (a[mid] > a[a.length - 1]) {
                st = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,10,1,2,3,4};
        System.out.println(minIndex(a)); // Output: 3
    }
}

