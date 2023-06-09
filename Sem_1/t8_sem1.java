// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива
// такой, что сумма элементов с индексами < i равна сумме
// элементов с индексами > i. 


package Sem_1;

public class t8_sem1 {
    public static void main(String[] args) throws Exception {
        int[] num={1,7,3,6,5,6};
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                sum1=sum1+num[j];
            }
            for (int k = i+1; k < num.length; k++) {
                sum2=sum2+num[k];
            }
            if (sum1==sum2){
                System.out.println(i);
                break;
            }
            else {
                sum1=0;
                sum2=0;
            }
            
            
        }
    }
    
    
}
