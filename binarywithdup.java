/* search element in rotated sorted array whit duplucate element return true if element is find else return false input{0,0,0,1,1,1,2,0,0,0} target=2 o/p=true*/
public class binarywithdup {
        static int idx(int[] a, int target) {
            int low = 0;
            int high = a.length - 1;
            while (low < high) {
                int mid = (low + high) / 2;
                if (a[mid] == target)
                 {
                    return mid;
                }
                if(a[low]==a[mid]&&a[mid]==a[high]){
                    low++;
                    high--;
                    continue;
                }
                if (a[low] < a[mid]) {
                    if (target >= a[low] && 
                    target < a[mid]) {
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
            int[] a = {7,8,1,2,3,3,3,4,5,6};
            int target = 4;
            System.out.println(idx(a, target)); 
        }
    }

