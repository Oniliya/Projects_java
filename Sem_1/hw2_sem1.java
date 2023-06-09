// 2. Вывести все простые числа от 1 до 1000



package Sem_1;

import java.util.Scanner;

public class hw2_sem1 {
    public static void main(String[] args) throws Exception {

        int n= input_num();
        
        for (int i = 1; i <= n; i++) {
            if (del_num(i)==0){
                System.out.println(i);
            }
        }

    }

    private static int del_num(int number){
        for (int i = 2; i < number/2+1; i++) {
            if (number%i == 0){
                return 1;
                // break;
            }
        }
        return 0;
    }


    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");

        String number = iScanner.nextLine();

        Integer res = Integer.valueOf(number);

        return res;
    }        
}
