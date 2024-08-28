public class inheritence {
    public void eat(){
        System.out.println("eat");
    }
}
class dog extends inheritence{
public static void main(String[] args) {
    dog d=new dog();
    d.eat();
}
}
