// 3. * В калькулятор добавьте возможность отменить последнюю операцию.

// 3(со звездочкой) В калькулятор добавьте возможность отменить последнюю операцию. Калькулятор сделать на основе программы разработанной на семинаре.





// 3(со звездочкой) В калькулятор добавьте возможность отменить последнюю операцию. Калькулятор сделать на основе программы разработанной на семинаре.


package Sem_4;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class hw3_sem4 {

    private static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        boolean getIteration = true;

        while (getIteration) {
            String command = inputCommand("введите команду (например: 5+4 или del (удалить последнее действие)) ");
            if  (command.contains("+")) {
                String[] cLine = command.split("\\+");
                String res = cLine[0] + " + " + cLine[1] + " = " + String.valueOf(Integer.valueOf(cLine[0])+Integer.valueOf(cLine[1]));
                addLine(res, list);
                printList();
            }
            else if (command.contains("-")) {
                String[] cLine = command.split("\\-");
                String res = cLine[0] + " - " + cLine[1] + " = " + String.valueOf(Integer.valueOf(cLine[0])-Integer.valueOf(cLine[1]));
                addLine(res, list);
                printList();
            }
            else if (command.contains("*")) {
                String[] cLine = command.split("\\*");
                String res = cLine[0] + " * " + cLine[1] + " = " + String.valueOf(Integer.valueOf(cLine[0])*Integer.valueOf(cLine[1]));
                addLine(res, list);
                printList();
            }
            else if (command.contains("/")) {
                String[] cLine = command.split("\\/");
                String res = cLine[0] + " / " + cLine[1] + " = " + String.valueOf(Float.valueOf(cLine[0])/Float.valueOf(cLine[1]));
                addLine(res, list);
                printList();
            }
            else if (command.contains("del")) {
                System.out.println(list.pollLast()+" удалено ");
                System.out.println();
                printList();
            }
        }
    }


    private static String inputCommand(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    private static List<String> addLine(String splitted, List<String> list) {
        list.add(splitted);
        // if (isInt(splitted[1])) {
        //     int num = Integer.parseInt(splitted[1]);
        //     if (num > list.size()) {
        //         for (int i = list.size() - num; i < num + 1; ++i) {
        //             list.add(" ");
        //         }
        //     }
        //     list.add(num, splitted[0]);
        // }
        return list;
    }
    
    private static void printList() {
        for(String state : list){
            System.out.println(state);
        }        
    }
}
