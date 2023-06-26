// Задание №5
// Взять набор строк, например,

// Мороз и солнце день чудесный 
// Еще ты дремлешь друг прелестный 
// Пора красавица проснись.

// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
// одинаковой длиной не должны “потеряться”.

package HashMapTest;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Comparator;

public class Task5_sem5 {
    public static TreeMap<String, Integer> sortHashMap(HashMap<String, Integer> notSortedMap) {
        // TreeMap<String, Integer> sortedMap = new TreeMap<>(notSortedMap);
        // return sortedMap;

        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(
            new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    return Integer.compare(s1.length(), s2.length());
                }
            }
        );
        sortedMap.putAll(notSortedMap);
        return sortedMap;
    }
    
    
}
