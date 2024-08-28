import java.util.Stack;

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int N = mat.length; // Get the number of rows
        Stack<Integer> st = new Stack<>();

        // Step 1: Push all candidates onto the stack
        for (int i = 0; i < N; i++) {
            st.push(i);
        }

        // Step 2: Determine the potential celebrity
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (mat[a][b] == 1) {
                // a knows b, so a is not the celebrity, push b back
                st.push(b);
            } else {
                // a does not know b, so b is not the celebrity, push a back
                st.push(a);
            }
        }
        if(st.size()==0) return -1;
        int potentialCel = st.pop();

        // Step 3: Verify if the potential celebrity is a real celebrity
        for (int i = 0; i < N; i++) {
           if(mat[potentialCel][i]==1) return -1;
        }
        for(int j=0;j<N;j++)
        {
            if(j==potentialCel) continue;
            if(mat[j][potentialCel]==0) return -1;
        }
        return potentialCel; // Real celebrity
    }
}

public class Stack_celebrity {
    public static void main(String[] args) {
        int[][] M = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        System.out.println(new Solution().celebrity(M)); // Expected output: 1
    }
}
