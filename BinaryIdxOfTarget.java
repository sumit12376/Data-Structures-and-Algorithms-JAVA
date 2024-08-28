/*given the rotated sorted array of integer which cantain distinct element and an integer target return the index of target if it is in arry otherwise -1 */
/*arr=3,4,5,1,2 */
public class BinaryIdxOfTarget {
    static int idx(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (a[low] < a[mid]) {
                if (target >= a[low] && target < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > a[mid] && target <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 1, 2, 3};
        int target = 2;
        System.out.println(idx(a, target)); 
    }
}

