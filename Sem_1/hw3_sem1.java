// 3. Реализовать простой калькулятор

package Sem_1;

import java.util.Scanner;

public class hw3_sem1 {
    public static void main(String[] args) throws Exception {

        int n1 = input_num();
        String sign = input_sign();
        int n2= input_num();
        
        calc(n1, n2, sign);

    }


    private static void calc(int a, int b, String zn) {
        double d_n1 =a;
        double d_n2 =b;

        if (zn.equals("+")) System.out.println(d_n1+d_n2);
        else if (zn.equals("-")) System.out.println(d_n1-d_n2);
        else if (zn.equals("*")) System.out.println(d_n1*d_n2);
        else if (zn.equals("/")) System.out.println(d_n1/d_n2);
        
    }


    private static String input_sign() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите знак арифметической операции (+ - * /) ");
        String ch = iScanner.nextLine();
         
        return ch;
    }


    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");

        String number = iScanner.nextLine();

        Integer res = Integer.valueOf(number);

        return res;
    } 
}


