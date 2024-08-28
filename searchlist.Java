public class searchlist{
  static ArrayList<Integer> search(int[] arr, int target, int idx) {
      if (idx == arr.length) {
          return new ArrayList<Integer>();
      }
      ArrayList<Integer> ans = new ArrayList<>();
      if (arr[idx] == target) {
          ans.add(idx);
      }
      ArrayList<Integer> smallans = search(arr, target, idx + 1);
      ans.addAll(smallans);
      return ans;
  }

  public static void main(String[] args) {
      int arr[] = { 5, 6, 3, 2, 5 };
      int target = 5;
      ArrayList<Integer> result = search(arr, target, 0);
      for (int i = 0; i < result.size(); i++) {
          System.out.println(result.get(i));
      }
  }
}
