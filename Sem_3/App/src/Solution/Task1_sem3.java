package Solution;
// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1_sem3 {
    public static void name2() {
        List<Integer> numL = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<10; i++) {
            numL.add(random.nextInt(100));
        }
        System.out.println(numL);
        Collections.sort(numL);

        System.out.println(numL);



    }
}