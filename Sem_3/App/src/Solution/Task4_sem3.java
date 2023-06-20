package Solution;
// Задание №4
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.List;

public class Task4_sem3 {
    public static void name5() {
        List<List<String>> library = new ArrayList<>();
        // library.get(0).get(1) = "1";
        List<String> gList = new ArrayList<>();
        gList.add("проза");
        gList.add("Стругацкие");
        gList.add("Толстой");

        library.add(gList);


        List<String> gList2 = new ArrayList<>();
        gList2.add("поэзия");
        gList2.add("бородино");
        gList2.add("стихи");

        library.add(gList2);

        System.out.println(library);

        

    }
}
