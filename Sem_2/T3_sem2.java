// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package Sem_2;

import java.util.Scanner;

public class T3_sem2 {
    public static void execute() {
        String str1 = input_string();
        System.out.println(check_str(str1));
    }
    
    private static String input_string() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку  ");

        String ch = iScanner.nextLine();

        return ch;
    }  

    private static Boolean check_str(String str){
        Boolean fl=true;
        for (int i=0; i< (str.length()-1)/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                fl=false;
                break;
            }
        }
        return fl;
        
    }
}
