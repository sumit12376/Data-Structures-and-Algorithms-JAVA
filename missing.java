public class missing {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 9};
        for (int i = a[0]; i < 10; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {a
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
