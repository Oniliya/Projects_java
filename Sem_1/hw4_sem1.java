// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет


package Sem_1;

import java.util.Scanner;

public class hw4_sem1 {
    public static void main(String[] args) throws Exception {
        String q=input_num();
        String w=input_num();
        String e=input_res();
        System.out.println(q + " + " + w + " = " + e);

        int sum1=0;
        int sum2=0;

        boolean fl=false;

        if ((q.charAt(0)!='?') && (q.charAt(1)=='?') && (w.charAt(0)!='?') && (w.charAt(1)=='?')){
            for (int i = 0; i < 10; i++) {
                sum1 = Character.digit(q.charAt(0), 10)*10+i;
                for (int j = 0; j < 10; j++) {
                    sum2 = Character.digit(w.charAt(0), 10)*10+j;  
                    if (sum1+sum2 == Integer.valueOf(e)) {
                        System.out.print(sum1);
                        System.out.print(" + ");
                        System.out.print(sum2);
                        System.out.println("");
                        fl = true;
                    }
                }
            }
        }
        else if ((q.charAt(0)!='?') && (q.charAt(1)=='?') && (w.charAt(0)=='?') && (w.charAt(1)!='?')){
            for (int i = 0; i < 10; i++) {
                sum1 = Character.digit(q.charAt(0), 10)*10+i;
                for (int j = 0; j < 10; j++) {
                    sum2 = j*10 + Character.digit(w.charAt(1), 10);  
                    if (sum1+sum2 == Integer.valueOf(e)) {
                        System.out.print(sum1);
                        System.out.print(" + ");
                        System.out.print(sum2);
                        System.out.println("");
                        fl = true;
                    }
                }
            }
        }
        else if ((q.charAt(0)=='?') && (q.charAt(1)!='?') && (w.charAt(0)!='?') && (w.charAt(1)=='?')){
            for (int i = 0; i < 10; i++) {
                sum1 = i*10+Character.digit(q.charAt(1), 10);
                for (int j = 0; j < 10; j++) {
                    sum2 = Character.digit(w.charAt(0), 10)*10+j;  
                    if (sum1+sum2 == Integer.valueOf(e)) {
                        System.out.print(sum1);
                        System.out.print(" + ");
                        System.out.print(sum2);
                        System.out.println("");
                        fl = true;
                    }
                }
            }
        }
        else if ((q.charAt(0)=='?') && (q.charAt(1)!='?') && (w.charAt(0)=='?') && (w.charAt(1)!='?')){
            for (int i = 0; i < 10; i++) {
                sum1 = i*10+Character.digit(q.charAt(1), 10);
                for (int j = 0; j < 10; j++) {
                    sum2 = j*10 + Character.digit(w.charAt(1), 10);  
                    if (sum1+sum2 == Integer.valueOf(e)) {
                        System.out.print(sum1);
                        System.out.print(" + ");
                        System.out.print(sum2);
                        System.out.println("");
                        fl = true;
                    }
                }
            }
        }
        if (fl == false) {System.out.println("решения нет");}

    }




    private static String input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите двузначное слагаемое ** или его часть *? | ?* -> ");
        String number = iScanner.nextLine();
        return number;
    } 
    private static String input_res() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите сумму -> ");
        String number = iScanner.nextLine();
        return number;
    } 
}

