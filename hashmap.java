
import java.util.*;


public class hashmap {
    public static void main(String[] args) {
        //lets simply understand what is hashmap 
        //It is a data Structure which store data in form of key and value pair 
        HashMap <Integer , Integer> hash = new HashMap<>();
        hash.put(1, 1);
        hash.put(2, 1);
        //So in this updation and insertion is easily done
        hash.put(1, 2);
        // hash.remove(2);
        hash.get(2);
        hash.containsKey(2);
        System.out.println(hash.entrySet());
        System.out.println(hash.keySet());
        System.out.println(hash.values());
        for(int key : hash.keySet()){
            System.out.println(key);
        }
        
    }
}
