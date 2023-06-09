// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)


package Sem_1;

import java.util.Scanner;

public class hw1_sem1 {
    public static void main(String[] args) throws Exception {

        int n= input_num();
        System.out.println(sum_num(n));
        System.out.println(fact_num(n));
    
    }

    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");

        String number = iScanner.nextLine();

        Integer res = Integer.valueOf(number);

        return res;
    }

    private static int sum_num(int num) {
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum=sum+i;
        }
        return sum;
    }

    private static int fact_num(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        return fact;
    }
    
}
