package org.example;

import java.util.*;

/**
 * A simple class which contains a method for sorting an hashMap based on values.
 *
 * <p>
 * This is a test class.
 * </p>
 *
 * @author Alin
 * @version 1.0
 */
public class App {
    /**
     * @param map a HashMap to be sorted by value
     * @return sorted map by values
     */
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    /**
     * Entry point
     *
     * <p>
     * Contains a predefined HashMap with random keys and values to test sortByValue method.
     * </p>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 3);
        map.put(5, 2);
        map.put(4, 1);
        map.put(123, 7);
        map.put(121, 89);
        map.put(6345, 7);
        System.out.println(sortByValue(map));
    }
}
