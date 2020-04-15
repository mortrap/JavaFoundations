package collectionsAndMaps.mapPractice;

import collectionsAndMaps.listPractice.Berry;
import collectionsAndMaps.listPractice.Fruit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPracticeBerry {
    public static void main(String[] args) {
        HashMap<String, Object> combineHashMap = new HashMap<>();
        Fruit apple = new Fruit("Apple", "Rosaceae", "B, A, C, K, H, E, P, PP");
        Fruit orange = new Fruit("Orange", "Citrus", "A, C, P, group B & D");
        Fruit apricot = new Fruit("Apricot", "Drupaceous", "C, E, group B & A");
        Fruit banana = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Fruit peach = new Fruit("Peach", "Drupaceous", "A, beta-carotene, E, A," +
                " C, B1, B2, B3(PP), B4, B5, B6, B9");
        Fruit bAnana = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Fruit bANana = new Fruit("Banana", "Tropical", "A, B, C, B6");
        Berry blueberry = new Berry("Blueberry", "Real five-pointers", "B1, B2, PP, C, A, P");
        combineHashMap.put("Apple", apple);
        combineHashMap.put("Orange", orange);
        combineHashMap.put("Apricot", apricot);
        combineHashMap.put("Banana", banana);
        combineHashMap.put("Peach", peach);
        combineHashMap.put("Blueberry", blueberry);
        HashMap<String, Object> subCombHashMap = new HashMap<>();
        for (Map.Entry<String, Object> pair : combineHashMap.entrySet()) {
            if (pair.getValue().getClass().getTypeName().equals(Fruit.class.getTypeName())) {
                subCombHashMap.put(pair.getKey(), pair.getValue());
            }
        }
        Iterator<HashMap.Entry<String, Object>> iterator = combineHashMap.entrySet().iterator();

//        while (iterator.hasNext()) {
//            if (!iterator.getClass().getTypeName().equals(Berry.class.getTypeName())) {
//                iterator.remove();
//            }
//        }
        for (Map.Entry<String, Object> pair : subCombHashMap.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println("---------");
        for (Map.Entry<String, Object> pair : combineHashMap.entrySet()) {
            if (!pair.getValue().getClass().getTypeName().equals(Fruit.class.getTypeName())) {
                System.out.println("pair.getValue().getClass().getTypeName() = "
                        + pair.getValue().getClass().getTypeName());
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}

