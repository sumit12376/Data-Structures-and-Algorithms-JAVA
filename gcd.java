public class gcd {//euclid algo
    static int gcdd(int x,int y){
if(y==0) return x;
return gcdd(y,x%y);
    } 
    public static void main(String[] args) {
             int x= 5;
            int y = 4;
            int r=gcdd(x, y);
            System.out.println("the gcd of givrnn number "+r);
            int lcm=(x*y)/r;
            System.out.println("the lcm of givrn number"+lcm);
         }
}
