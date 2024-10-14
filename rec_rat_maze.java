// public class rec_rat_maze {
//     public static void main(String[] args) {
//         int rows =3;
//         int cols=3;
//         int count =maze(1,1,rows,cols);
//         System.out.println(count);
//     }
//     public static int maze(int sr,int sc,int er,int ec ){
//         if(sr>er||sc>ec)return 0;
//         if(sr==er&&sc==ec)return 1;
//         int downways=maze(sr+1,sc,er,ec);
//         int rightways=maze(sr,sc+1,er,ec);
//         int totalway=downways+rightways;
//         return totalway;
//     }}
// maze(1, 1, 3, 3)
// │
// ├── maze(2, 1, 3, 3)
// │   ├── maze(3, 1, 3, 3)
// │   │   ├── maze(4, 1, 3, 3) → 0
// │   │   └── maze(3, 2, 3, 3)
// │   │       ├── maze(4, 2, 3, 3) → 0
// │   │       └── maze(3, 3, 3, 3) → 1
// │   │   Total = 1
// │   └── maze(2, 2, 3, 3)
// │       ├── maze(3, 2, 3, 3) → 1
// │       └── maze(2, 3, 3, 3)
// │           ├── maze(3, 3, 3, 3) → 1
// │           └── maze(2, 4, 3, 3) → 0
// │       Total = 2
// │   Total = 3
// │
// └── maze(1, 2, 3, 3)
//     ├── maze(2, 2, 3, 3) → 2
//     └── maze(1, 3, 3, 3)
//         ├── maze(2, 3, 3, 3) → 1
//         └── maze(1, 4, 3, 3) → 0
//     Total = 3

// Total paths = 3 (from down) + 3 (from right) = 6

public class rec_rat_maze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        print(1, 1, rows, cols, "");
    }

    public static void print(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        print(sr + 1, sc, er, ec, s + "D");
        print(sr, sc + 1, er, ec, s + "R");
    }
}
