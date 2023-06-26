import java.util.HashMap;
import java.util.TreeMap;

import javax.sound.sampled.Line;

import HashMapTest.Task0_sem5;
import HashMapTest.Task2_sem5;
import HashMapTest.Task5_sem5;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // HashMap<Integer, String> map = Task0_sem5.fill();
        // Task0_sem5.printHashMap(map);
        // Task0_sem5.printNeededHashMap(map, "Иванов");
        
        // String line1= "a+(d*3)";
        // String line2= "[a+(1*3)";
        // String line3= "[6+(3*3)]";
        // String line4= "{a}[+]{(d*3)}";
        // String line5= "<{a}+{(d*3)}>"; 
        // String line6= "{a+]}{(d*3)}";
        // HashMap<String, Integer> openBr = new HashMap();
        // openBr.put("(", 0);
        // openBr.put("{", 1);
        // openBr.put("[", 2);
        // openBr.put("<", 3);
        // HashMap<String, Integer> closeBr = new HashMap();
        // closeBr.put(")", 0);
        // closeBr.put("}", 1);
        // closeBr.put("]", 2);
        // closeBr.put(">", 3);

        // System.out.println(line1);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line1));
        // System.out.println(line2);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line2));
        // System.out.println(line3);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line3));
        // System.out.println(line4);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line4));
        // System.out.println(line5);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line5));
        // System.out.println(line6);
        // System.out.println(Task2_sem5.validation(openBr, closeBr, line6));

        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] sLine = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : sLine) {
            map.put(s, s.length());
        }
        // System.out.println(Task5_sem5.sortHashMap(map));

        TreeMap<String, Integer> sortMap = Task5_sem5.sortHashMap(map);
        sortMap.entrySet().forEach(System.out::println);
    }

}
