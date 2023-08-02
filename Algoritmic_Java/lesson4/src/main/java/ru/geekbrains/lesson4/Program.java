package ru.geekbrains.lesson4;

import ru.geekbrains.lesson4.HashMap.Entity;

public class Program {

    public static void main(String[] args) {

        // создаем собстрвенный hashMap (поэтому не импортируем встроенный) нет import java.util.HashMap;
        HashMap<String, String> hashMap = new HashMap<String, String>(4);


        String res = hashMap.put("+79005554431", "Андрей");
        res = hashMap.put("+790055544321", "Алексей");
        res = hashMap.put("+79005554432", "Дарья1");
        res = hashMap.put("+79005554433", "Дарья2");
        res = hashMap.put("+79005554434", "Дарья3");
        res = hashMap.put("+79005554435", "Дарья4");
        res = hashMap.put("+79005554436", "Дарья5");
        res = hashMap.put("+79005554437", "Дарья6");
        res = hashMap.put("+79005554438", "Дарья7");
        res = hashMap.put("+79005554439", "Дарья8");


        res = hashMap.get("+79005554436");
        // System.out.println(res);

        // hashMap.remove("+79005554438");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }


    }

}


// Необходимо доработать структуру класса HashMap, реализованную на семинаре.
// У нас появились методы добавления, удаления и поиска элемента по ключу.

// Добавить возможность перебора всех элементов нашей структуры данных, 

// необходимо добавить несколько элементов, 
// а затем перебрать все элементы таблицы используя цикл foreach. 
// Подумайте, возможно вам стоит обратиться к интерфейсу Iterable.