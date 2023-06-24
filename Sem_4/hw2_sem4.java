// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.





package Sem_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class hw2_sem4 {
    public static void main(String[] args) throws IOException {
    int count = input_num();
    LinkedList<String> lListMyQueue = createLinkedList(count);
    System.out.println(lListMyQueue); 
    add_elem(lListMyQueue);

    }
    private static LinkedList<String> enqueue(String element, LinkedList<String> toList) {
        LinkedList<String> list = toList;
        list.addLast(element);
        return list;
    }

    private static LinkedList<String> top(String element, LinkedList<String> toList) {
        LinkedList<String> list = toList;
        list.addFirst(element);
        return list;
    }
    
    private static LinkedList<String> dequeue(LinkedList<String> toList) {
        LinkedList<String> list = toList;
        String tmp = list.pollFirst();
        System.out.println(tmp);
        return list;
    }

    private static LinkedList<String> first(LinkedList<String> toList) {
        LinkedList<String> list = toList;
        System.out.println(list.getFirst());
        return list;
    }

    private static void add_elem(LinkedList<String> toList) {
        LinkedList<String> list = toList;
        boolean getIteration = true;
        while (getIteration) {
            String command = inputCommand("введите команду \nдобавить в начало очереди - top \nдобавить в конец очереди - last \nпоказать первый элемент из очереди и удалить его - dequeue \nпоказать первый элемент очереди и НЕ удалять его - first)");
            command = command.toUpperCase();
            String st= new String();
            switch (command) {
                case "TOP":
                    st=new_elem();
                    top(st, list);
                    System.out.println(list);
                    break;
                case "LAST":
                    st=new_elem();
                    enqueue(st, list);
                    System.out.println(list);
                    break;
                case "DEQUEUE":
                    dequeue(list);
                    System.out.println(list);
                    break;
                case "FIRST":
                    first(list);
                    System.out.println(list);
                    break;

                default:
                    getIteration = false;
                    break;
            }

        }

    }

    private static String new_elem() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите новый элемент в очереди ");
        String number = iScanner.nextLine();
        return number;
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
        System.out.printf("Введите количество элементов в очереди ");
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }
    
    public static String inputCommand(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
