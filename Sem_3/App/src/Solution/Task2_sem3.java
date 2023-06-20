package Solution;
// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2_sem3 {
    public static void name3() {
        String[] pl = new String[]{"Меркурий", "Венера", "Венера", "Марс", "Земля", "Юпитер", "Сатурн","Уран", "Нептун"};
        List<String> plList = Arrays.asList(pl);
        System.out.println(plList);

        Set<String> plSet = new HashSet <>(plList);

        for(String plan: plSet){
            System.out.println(plan + " " + Collections.frequency(plList, plan));
        }

        System.out.println(plSet);

    }
}
