package hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //creating hash map
        Map<Integer, String> map = new HashMap<>();

        //adding values to map
        map.put(123, "java");
        map.put(124, "python");
        map.put(125, "kotlin");
        map.put(126, "c++");

        //printing map
        for (Map.Entry<Integer, String> itr: map.entrySet()){
            int key = itr.getKey();
            String value = itr.getValue();
            System.out.println("Key: "+key+", Value: "+value);
        }

        //retrieving only key
        Set<Integer> keySet = map.keySet();
        for (Integer key: keySet){
            System.out.println(key);
        }
    }
}
