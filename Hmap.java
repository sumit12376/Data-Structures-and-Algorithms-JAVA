import java.util.HashMap;
import java.util.Map;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String,Integer>mp=new HashMap<>();
        mp.put("sumit",23);
        mp.put("suysh",21);
        mp.put("seee",213);
        mp.put("sumisst",123);
        //getting the vlaue in hashmap
        System.out.println(mp.get("suysh"));//21
        System.out.println(mp.get("rahul"));//null

        //changing or updating the value of key in hasdmap
        mp.put( "sumit",27);
        System.out.println(mp.get("sumit"));

        //remove a pair from hashmap
        System.out.println(mp.remove("suysh"));  //agar hoga to key return karega nhi hoga to null return karega
        System.out.println(mp);

        //checkinng if the key is in hashmap
        System.out.println(mp.containsKey("sumit"));

        //adding a new entry only if the new key doest exist
        mp.putIfAbsent("yashi",25);
        System.out.println(mp);

        //getting all key in hashmap
        System.out.println(mp.keySet());

        //getting all the the values 
        System.out.println(mp.values());

        //getting all entries in hashmap
        System.out.println("allllllllllllllllllllll"+mp.entrySet());
       

        //traversing all the entris of hashmap-multiple method
        for (String key : mp.keySet()) {
            System.out.printf("age of %s is %d%n", key, mp.get(key));
        }
        System.out.println();

        for(Map.Entry <String,Integer>e:mp.entrySet()){
            System.out.printf("age of %s is %d%n", e.getKey(),e.getValue());
        }
        System.out.println("this proved by java vesion 10 not require to put datatype only put var");
        for(var e:mp.entrySet()){
            System.out.printf("age of %s is %d%n", e.getKey(),e.getValue());
        }
        
    }

}















