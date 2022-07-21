import java.util.HashMap;
import java.util.Map;

public class Ques {

    public static void main(String[] args) {
        String name = "christopher";

        Map<Character, Integer> MapCount = new HashMap<>();

        for (Character c : name.toCharArray()) {
            if (MapCount.containsKey(c)) {
                MapCount.put(c, MapCount.get(c) + 1);
            } else
                MapCount.put(c, 1);
        }
        System.out.println(MapCount);
        
            
        
    }
}
