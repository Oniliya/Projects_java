// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package Sem_1;

import java.lang.reflect.Array;

public class t2_sem1 {
   public static void main(String[] args) throws Exception {
        task2();
        

   }

private static void task2() {
    int[] numbers = {1,1,0,1,1,1,1};
    int count =0;
    int len = 0;
    for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] ==1) {
            count++;
        }
        else {
            if (count> len) {
                len=count;
            }
            count=0;
        }
    }
    if (count> len){
        len=count;
    }
    System.out.println(len);

} 
}
