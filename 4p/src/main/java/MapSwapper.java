import java.util.HashMap;
import java.util.Map;

public class MapSwapper{
    public static <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Map<Integer, String> swapped = swap(map);

        System.out.println(swapped);
    }
}