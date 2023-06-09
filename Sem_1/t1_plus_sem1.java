// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Sem_1;

import java.util.Scanner;
import java.time.LocalTime;
import java.util.Date;

public class t1_plus_sem1 {
    public static void main(String[] args) throws Exception {

        task2();
        
    }

    private static void task2() {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("Введите имя ");
            String name = iScanner.nextLine();

            // System.out.printf("Привет, %s!\n", name);   
            LocalTime time = LocalTime.now();
            // System.out.println(time);

            if (time.getHour() >= 5 && time.getHour() <12) {
                System.out.println("Доброе утро, " + name + "!");
            }
            else if (time.getHour() >= 12 && time.getHour() <18) {
                System.out.println("Добрый день, " + name + "!");
            }
            else if (time.getHour() >= 18 && time.getHour() <23) {
                System.out.println("Добрый вечер, " + name + "!");
            }
            else if (time.getHour() >= 23 && time.getHour() <5) {
                System.out.println("Доброй ночи, " + name + "!");
            }
        }

    }
}
