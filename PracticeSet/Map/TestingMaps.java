package Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Arshad", 21);
        map.put("Rehman", 25);
        map.put("Hafiz", 20);
        map.put("Abrar", 19);
        System.out.println(map.size());
        System.out.println(map.get("Arshad"));
        System.out.println(map.containsKey("Abrar"));
        System.out.println(map.containsKey("Afshan"));
        System.out.println(map.size());
        System.out.println(map.put("Afshan", 18));
        System.out.println(map.remove("Afshan"));

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));

        }

    }
}
