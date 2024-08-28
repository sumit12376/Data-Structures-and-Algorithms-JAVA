// public class abstraction2 {//abstraction using interface
//     public static void main(String[] args) {
//         test d=new test();
//         d.show();
//     }
    
// }
// interface I1{
//     public abstract void show();
// }

// class test implements I1{
//     public void show()
//     {
//         System.out.println("1");
//     }
// }

//multiple inheritence by interface

public class abstraction2 {
    public static void main(String[] args) {
        test d=new test();
        d.show();
        d.display();
    }
    
}
interface I1{
    public abstract void show();
}
interface I2{
    public abstract void display();
}


class test implements I1,I2{
    public void show()
    {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    
}