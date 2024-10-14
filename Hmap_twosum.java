import java.util.HashMap;

public class Hmap_twosum {
    public static void main(String[] args) {
         HashMap<Integer, Integer> mp = new HashMap<>();
         int[] a = {1, 2, 3, 4, 5, 6, 7};
         int target=10;
         boolean found = false;
         for (int i = 0; i < a.length; i++) {
            int tar=target-a[i];
            if(mp.containsKey(tar)){
                System.out.println("Indices: " + mp.get(tar) + ", " + i);
                found=true;
                break;
            }
            else{
                mp.put(a[i],i);
            }
         }
         if (!found) {
            System.out.println("No two sum solution found");
        }   
    }
}
