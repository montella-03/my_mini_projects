import java.util.HashMap;
import java.util.Map;

public class Ques {

    public static void main(String[] args) {
        int[] name = { 2, 4, 5, 6, 7, 8, 9, 2, 4, };

        Map<Integer, Integer> MapCount = new HashMap<>();

        for (int c : name) {
            if (MapCount.containsKey(c)) {
                MapCount.put(c, MapCount.get(c) + 1);
            } else
                MapCount.put(c, 1);
        }
        
        for (Map.Entry<Integer, Integer> numberMap : MapCount.entrySet()) {
            if (numberMap.getValue() % 2 != 0) {
                System.out.println(numberMap.getKey());
            }
        }
        
            
        
    }
}
