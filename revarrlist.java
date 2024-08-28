
import java.util.ArrayList;
import java.util.Collections;

public class revarrlist {
    
    static void reverselist(ArrayList<Integer> l1){
        int i=0;
       int  j=l1.size()-1;
        while(i<j)
        {
            Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i, l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
        }


    
}
public static void main(String[] args) {
    ArrayList <Integer> l1 =new ArrayList<>();
    l1.add(5);
    l1.add(55);
    l1.add(56);
    l1.add(06);
    l1.add(533);
    l1.add(575);
    l1.add(5556);
    l1.add(63);
    System.out.println(l1);
    reverselist(l1);
    System.out.println(l1);
    Collections.reverse(l1);//inbuilt
    System.out.println("reversed list" + l1);
}
}