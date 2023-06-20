// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из
// этого списка.
// // 

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hw3_sem3 {
    public static void main(String[] args) throws IOException {
        List<Integer> myList = createList(input_num());
        System.out.println(myList);

        System.out.println(findMax(myList));
        System.out.println(findMin(myList));

        System.out.println(findAverage(myList));
        
    }

    private static double findAverage(List<Integer> fromList) {
        int sum=0;
        for (Integer i: fromList) {
            sum=sum+i;
        }
        double res = sum/fromList.size();
        return res;
    }

    private static int findMin(List<Integer> fromList) {
        int min=fromList.get(0);
        for (Integer i: fromList) {
            if(i < min) 
                min = i;
        }
        return min;
    }

    private static int findMax(List<Integer> fromList) {
        int max=fromList.get(0);
        for (Integer i: fromList) {
            if(i > max) 
                max = i;
        }
        return max;
    }

    private static List<Integer> createList(int count){
        List<Integer> iList=new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<count; i++) {
            iList.add(random.nextInt(100));
        }
        return iList;
    }
    
    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов в списке ");
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }    
}
