// ДЗ
// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.

// Формат сдачи: ссылка на подписанный git-проект.

// Задание
// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.




package Sem_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class hw1_sem4 {
    public static void main(String[] args) throws IOException {
        int listLen = input_num();
        LinkedList<String> lList = createLinkedList(listLen);

        System.out.println(lList);

        for (int i=lList.size(); i>0; i-- ){
            System.out.print(lList.pollLast()+" ");
        }
        
    }
    private static LinkedList<String> createLinkedList(int count){
        LinkedList<String> list = new LinkedList<>();
        Random random = new Random();
        for (int i=0; i<count; i++) {
            list.add(Integer.toString(random.nextInt(100)));
        }
        return list;
    }

    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов в списке ");
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }
}


// case "REVERSE":
//     ....
