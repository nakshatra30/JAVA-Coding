import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // TO SHARE THE KEY-VALUE PAIRS IN HASHMAP
        map.put("Name", "NAKSHATRA");
        map.put("House", "19B");
        map.put("Area", "SARAVANAMPATTI");
        map.put("District", "Coimbatore");

        System.out.println("ORIGINAL MAP: " + map);

        // put(key, Updated_value) -> UPDATE ELEMENT IN HASHMAP
        map.put("House", "40A");
        System.out.println("After update the house number: " + map);

        // get() -> USING KEY GET THE VALUE
        System.out.println("Area: " + map.get("Area"));

        // containsKey() -> TO CHECK IF KEY EXISTS IN MAP
        System.out.println("District contains? " + map.containsKey("District"));

        // size() -> TO CHECK THE NUMBER OF ELEMENTS IN MAP
        System.out.println("Size: " + map.size());

        // REMOVE ANY ELEMENT USING KEY
        map.remove("Area");

        System.out.println("After removing Area: " + map);

        // ITERATE OVER MAP
        for (Map.Entry<String, String> dataset: map.entrySet()) {

            // RETRIEVE KEY
            String key = dataset.getKey();

            // RETRIEVE VALUE
            String value = dataset.getValue();

            System.out.println(key + " : " + value);
        }
        //PRINT ONLY KEY FROM HASHMAP
        System.out.println("Keys on the Map: "+map.keySet());
    }
}