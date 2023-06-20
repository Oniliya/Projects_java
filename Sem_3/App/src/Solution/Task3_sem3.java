package Solution;
// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3_sem3 {
    public static void name4() {
        List<Object> oList = new ArrayList<>();
        oList.add("A");
        oList.add(1);
        oList.add(2);
        oList.add("B");
        System.out.println(oList);
        for(int i=0; i<oList.size(); i++){
            System.out.println(oList.get(i).getClass());
        }
        
        oList.removeAll(Arrays.asList(new Integer[]{1,2}));
        System.out.println(oList);   
    }
    
}

