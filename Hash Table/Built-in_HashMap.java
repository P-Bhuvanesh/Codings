import java.util.*;

class Main{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Alice",29);
        map.put("Sundara",62);
        map.put("Nazim",15);
        
        System.out.println(map);
        
        System.out.println(map.get("Alice"));
        
        map.remove("Alice");
        System.out.println(map);
    }
}