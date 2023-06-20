// ДЗ
// 1. Реализовать алгоритм сортировки слиянием

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw1_sem3 {
    public static void main(String[] args) throws IOException {
        int[] mas = createMas(input_num());
        System.out.println(Arrays.toString(mas));

        quickSort(mas, 0, mas.length - 1);

        System.out.println(Arrays.toString(mas));

        
    }

    
    private static int[] createMas(int count){
        int[] mas = new int[count];
        Random random = new Random();
        for (int i=0; i<count; i++) {
            mas[i]=random.nextInt(100);
        }
        return mas;
    }
    
    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов в массиве ");
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }

    public static void quickSort(int[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }    




}
