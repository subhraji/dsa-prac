package hash_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //basicHashMap();
        problem4();
    }


    public static void basicHashMap(){
        //creating hash map
        Map<Integer, String> map = new HashMap<>();

        //adding values to map
        map.put(123, "java");
        map.put(124, "python");
        map.put(125, "kotlin");
        map.put(126, "c++");

        System.out.println("value is "+map.get(123));

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

    //Given an integer array of size n, find all elements that appear more than (n/3) times.
    public static void problem1(){
        int[] arr = {1,2,3,2,1,3,1,1,2};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()){
            if(map.get(key) > (n/3)){
                System.out.println(key);
            }
        }
    }

    //union of 2 array
    public static void problem2(){
        int[] arr1 = {1,2,3,2,1,3,};
        int[] arr2 = {1,2,6,4,5};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());

    }

    //intersection of 2 array
    public static void problem3(){
        int[] arr1 = {1,2,3,2,1,3,};
        int[] arr2 = {1,2,6,4,5};
        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                System.out.println("common element => "+arr2[i]);
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("total common element => "+count);

    }

    //itinerary ticket
    private static void problem4(){
        String start = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");

        for (String key : map.keySet()){
            if(!map.containsValue(key)){
                start = key;
            }
        }

        System.out.print(start+"-> ");
        while (map.containsKey(start)){
            System.out.print(start+" -> ");
            start = map.get(start);
        }
        System.out.print(start);
    }
}
