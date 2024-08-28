import java.util.Scanner;

public class strmaxaccurance {
    static void max(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                arr[index]++;
            }
        }

        // Find the maximum occurrence count and its corresponding letter
        int max = -1;
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                ans = i;
                max = arr[i];
            }
        }

        //Convert the index back to the corresponding letter
        char mostFrequentLetter = (char) ('a' + ans);

        System.out.println("The most frequent letter is: " +mostFrequentLetter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        max(str);
    }
}
