// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcddaa.

package Sem_2;

import java.util.Scanner;

public class T2_sem2 {
    public static void execute() {

        String str = input_string();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb_lost = new StringBuilder();
        int kol =0;
  
        for (int i=0; i<str.length(); i++ ) {
            for (int j=i; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    kol++;
                }
                // else if (j==) {
                //     break;
                // }
                else {
                    i=j-1;
                    break;
                }
            }
            sb.append(str.charAt(i));
            sb.append(Integer.toString(kol));

            sb_lost.append(str.charAt(i));
            
            if (i+kol==str.length()){
                break;
            }
            kol=0;

        }
        System.out.println(sb);
        System.out.println(sb_lost);
       
    }
    

    private static String input_string() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку  ");

        String ch = iScanner.nextLine();

        return ch;
    }    
}
