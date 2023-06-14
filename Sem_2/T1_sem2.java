// Задание №1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1

package Sem_2;

import java.util.Scanner;

public class T1_sem2 {
    //public static void main(String[] args) throws Exception {
    public static void execute() {
        int n= input_num();
        n = n/2;
        System.out.println(n);

        String ch1 = input_char();
        String ch2 = input_char();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            sb.append(ch1);
            sb.append(ch2);
        }
        System.out.println(sb);
        
    }
    
    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");

        String number = iScanner.nextLine();

        Integer res = Integer.valueOf(number);

        return res;
    }

    private static String input_char() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите символ  ");

        String ch = iScanner.nextLine();

        return ch;
    }

}