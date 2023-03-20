package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 130);
        map.put("China", 135);
        map.put("Us", 30);

//        if(map.containsKey("India")){
//            System.out.println("map contains india");
//        }else{
//            System.out.println("no result");
//        }
//
//        System.out.println(map.get("India"));
//        System.out.println(map.get("iran"));

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
