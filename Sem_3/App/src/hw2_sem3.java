// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hw2_sem3 {
        public static void main(String[] args) throws IOException {
        List<Integer> myList = createList(input_num());
        System.out.println(myList);

        
        System.out.println(delList(myList));

        
    }
    
    private static List<Integer> delList(List<Integer> fromList) {
        List<Integer> resList = new ArrayList<>();
        for(Integer num: fromList){
           if (num%2!=0) resList.add(num);
        }
        fromList.removeAll(resList);
        return resList;
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
