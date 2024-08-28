public class abstraction {//using abstract class 
    public static void main(String[] args) {
        car c=new car();
        c.start();
        bike s=new bike();
        s.start();
    }
    
}
abstract class vehical{
    abstract void start();
}
class car extends vehical{
    void start (){
        System.out.println("start with key");
    }
}
class bike extends vehical{
    void start(){
        System.out.println("start with kick");
    }
}

