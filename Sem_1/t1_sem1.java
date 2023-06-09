// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

package Sem_1;

import java.util.Scanner;

public class t1_sem1 {
    public static void main(String[] args) throws Exception {
        // System.out.println("dhgdlkgh");

        task1();
        

    }

    private static void task1() {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите имя ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);

        System.out.println("Привет, " + name + "!");
    }
    
    
}
