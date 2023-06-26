// Задание

// 1)Реализуйте структуру телефонной книги с помощью HashMap. 
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. 
// ывод должен быть отсортирован по убыванию числа телефонов.(можно выводить без сортировки, но обязательно в отдельном методе)

package Sem_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hw1_sem5 {
    public static void main(String[] args) throws Exception {
        String input = "Иванов 123456;Васильев 321456;Петрова 234561;Иванов 534432;Петрова 654321;Иванов 345678;Петров 4567913;Иванов 97654321";
        String[] sInput = input.split(";");
        for (String stItem : sInput) {
            System.out.println(stItem);
        }
        
        System.out.println("----------");
        HashMap<String, List<Integer>> outMap = phoneFill(sInput);
                
        print(outMap);

    }

    // заполнение
    public static HashMap<String, List<Integer>> phoneFill(String[] phones) {
        HashMap<String, List<Integer>> outMap = new HashMap<String, List<Integer>>();
        for (String s : phones){
            String[] sPhone = s.split(" ");
            if (!outMap.containsKey(sPhone[0])){
                List<Integer> phoneList = new ArrayList<Integer>();
                phoneList.add(Integer.parseInt(sPhone[1]));
                outMap.put(sPhone[0], phoneList);
            }
            else {
                outMap.get(sPhone[0]).add(Integer.parseInt(sPhone[1]));
            }
        }
        return outMap;
    }

    // вывод на экран
    private static void print(HashMap<String, List<Integer>> mapToPrint) {
        for (Map.Entry entry : mapToPrint.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
    
}
