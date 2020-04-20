package collectionsAndMaps.mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Fruit> fruitHashMap = new HashMap<>();
        Fruit apple = new Fruit("Apple", "Rosaceae", "B, A, C, K, H, E, P, PP");
        Fruit orange = new Fruit("Orange", "Citrus", "A, C, P, group B & D");
        Fruit apricot = new Fruit("Apricot", "Drupaceous", "C, E, group B & A");
        Fruit banana = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Fruit peach = new Fruit("Peach", "Drupaceous", "A, beta-carotene, E, A," +
                " C, B1, B2, B3(PP), B4, B5, B6, B9");
        Fruit banana1 = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Fruit banana2 = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Berry blueberry = new Berry("Blueberry", "Real five-pointers", "B1, B2, PP, C, A, P");
        fruitHashMap.put("Banana1", banana1);
        fruitHashMap.put("Banana2", banana2);
        fruitHashMap.put("Apple", apple);
        fruitHashMap.put("Orange", orange);
        fruitHashMap.put("Apricot", apricot);
        fruitHashMap.put("Banana", banana);
        fruitHashMap.put("Peach", peach);
        Fruit plum = new Fruit("Plum", "Drupaceous", "A, C, E, B1, B2, B3, B5, B6, B9");
        Fruit figs = new Fruit("Figs", "Subtropical", "A, C, E, B1, B2, B3, B5, B6, B9");
        HashMap<String, Fruit> otherFruitHashMap = new HashMap<>();
        otherFruitHashMap.put("Plum", plum);
        otherFruitHashMap.put("Figs", figs);
        fruitHashMap.putAll(otherFruitHashMap);
        System.out.println(fruitHashMap);
        fruitHashMap.remove("Apple");

        for (Map.Entry<String, Fruit> item : fruitHashMap.entrySet()
        ) {
            System.out.println("Key: " + " " + item.getKey() + " | " + "Value: " + " " + item.getValue());
        }
        System.out.println("fruitHashMap.get(\"Apple\") = " + fruitHashMap.get("Apple"));
        System.out.println("fruitHashMap.containsKey(\"Pineapple\") = " + fruitHashMap.containsKey("Pineapple"));
        System.out.println("fruitHashMap.containsValue(plum) = " + fruitHashMap.containsValue(plum));
        int count = 0;
        int numb = 0;
        for (Map.Entry<String, Fruit> item : fruitHashMap.entrySet()) {
            if (item.getKey().toCharArray().length > 5) {
                System.out.println("Key: " + " " + item.getKey());
                count++;
            }
        }
        System.out.println("Key count is: " + count);

        for (Map.Entry<String, Fruit> item : fruitHashMap.entrySet()) {
            if (item.getValue().getVitamins().contains("B3, B5")) {
                System.out.println("Value: " + " " + item.getValue());
                numb++;
            }
        }
        System.out.println("Value count is: " + numb);

        Iterator<HashMap.Entry<String, Fruit>> iterator = fruitHashMap.entrySet().iterator();
        count = 0;
        for (Map.Entry<String, Fruit> item : fruitHashMap.entrySet()) {
            if (item.getValue().getName().equalsIgnoreCase("banana")) {
                count++;
            }
            if (!item.getKey().equalsIgnoreCase("banana") || count > 2) {
                System.out.println("item.getValue() = " + item.getValue());
            }
        }
        System.out.println();
        count = 0;
        for(Fruit fruit: fruitHashMap.values()){
            if(fruit.getName().equalsIgnoreCase("banana")){
                count++;
            }
        }
        System.out.println(count);
    }
}
