
import java.util.*;

public class rec_backtracking_permutation {
    
public static void permutation(int[]nums,List<Integer> ds,boolean []isvalid, List<List<Integer>>ans){
    if(ds.size()==nums.length)
    {
        ans.add(new ArrayList<>(ds));
        return;
    }
   for(int i=0; i<nums.length;i++){
    if(isvalid[i]==false){
        ds.add(nums[i]);
        isvalid[i]=true;
        permutation(nums,ds,isvalid,ans);
        isvalid[i]=false;
        ds.remove(ds.size()-1);//remove last element
    }
   } 
}
public static  List<List<Integer>> permut(int[]nums){
    List<List<Integer>>ans=new  ArrayList<>();
    List<Integer>ds=new  ArrayList<>();
    boolean []isvalid=new boolean[nums.length];
  permutation(nums,ds,isvalid,ans);
  return ans;
}
public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    List<List<Integer>> permutations = permut(nums);
    for (List<Integer> perm : permutations) {
        System.out.println(perm);
    }
}
}
