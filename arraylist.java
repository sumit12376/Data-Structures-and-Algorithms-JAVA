import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Boolean> l2=new ArrayList<>();
        l1.add(5);
        l1.add(55);
        l1.add(56);
        l1.add(6);
        System.out.println(l1.get(2));
        l1.add(2,1000);
        System.out.println(l1);



    }
}
