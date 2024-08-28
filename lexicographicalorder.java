public class lexicographicalorder {
    static void sortFruit(String[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                String temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] a = {"kiwi", "apple", "banana"};
        sortFruit(a);
        for (String fruit : a) {
            System.out.println(fruit);
        }
    }
}
