public class rec_back_ratinmaze_deadbloack {
        public static void main(String[] args) {
            int rows = 3;
            int cols = 4;
            int[][] maze = {
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                
        };
        boolean[][]isvisited=new boolean[rows][cols];
            print(0, 0, rows-1, cols-1,"",maze,isvisited);
        }
    
        public static void print(int sr, int sc, int er, int ec, String s,int[][]maze,boolean [][]isvisited) {
            if(sr<0||sc<0)return;
            if (sr > er || sc > ec) return;
            if(maze[sr][sc]==0) return;
            if(isvisited[sr][sc]==true)return;
            if (sr == er && sc == ec) {
                System.out.println(s);
                return;
            }
           isvisited[sr][sc]=true;
           print(sr, sc + 1, er, ec, s + "R",maze,isvisited);
            print(sr + 1, sc, er, ec, s + "D",maze,isvisited);
          
            print(sr,sc-1, er, ec, s + "L",maze,isvisited);
            print(sr-1, sc, er, ec, s + "U",maze,isvisited);
            isvisited[sr][sc] =false; //backtracking
         }
    }

// agar do direction r and sown me ja raha hor to isvisited meand backtrackingka kam nahi hai

