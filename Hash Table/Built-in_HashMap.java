import java.util.*;

class Main{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Alice",29); //inserted to hashmap
        map.put("Sundara",62);
        map.put("Nazim",15);
        
        System.out.println(map);// Display of map table
        
        System.out.println(map.get("Alice"));// Retrieval of value
        
        map.remove("Alice");// Deletion of key-value pair
        System.out.println(map);
    }
}
