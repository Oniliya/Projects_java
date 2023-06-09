// Задание №6 (доп)
// Реализовать функцию возведения числа а в степень b. a, b из Z.
// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1


package Sem_1;

import java.util.Scanner;

public class t6_sem1 {
    public static void main(String[] args) throws Exception {

    int a= input_num();
    int b= input_num();

    int res = task6(a, Math.abs(b));   
    if (b<0){System.out.println(1.0/res);}
    else {System.out.println(res);}

    }

    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");
     
        String number = iScanner.nextLine();

        Integer res = Integer.valueOf(number);

        return res;
       
    }

    private static int task6(int a, int b) {
        int z=a;
        if (b!=0){
            for (int index = 1; index < b; index++) {
                z=z*a;
            }
        }
        else if (b==0){
            z = 1;
        }
        return z;
    }
}
