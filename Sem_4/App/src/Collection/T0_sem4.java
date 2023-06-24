// Задание №0
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class T0_sem4 {
    public static void TimeTest(int size) {

        Random rnd = new Random();

        List<Integer> simpleList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        // ArrayList<Integer> simpleList1 = new ArrayList<Integer>();
        // LinkedList<Integer> linkedList1 = new LinkedList<Integer>();


        long curTime = System.currentTimeMillis();
        System.out.println( curTime);

        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            simpleList.add(1);
        }
        System.out.println("simple list end "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            linkedList.add(1);
        }
        System.out.println("linked list end "+(System.currentTimeMillis()-curTime));


        simpleList.clear();
        linkedList.clear(); 

        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            simpleList.add(0,1);
        }
        System.out.println("simple list begin "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            linkedList.add(0,1);
        }
        System.out.println("linked list begin "+(System.currentTimeMillis()-curTime));



        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            simpleList.add(rnd.nextInt(10000), 1);
        }
        System.out.println("simple list middle "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0; i<size; i++){
            linkedList.add(rnd.nextInt(10000), 1);
        }
        System.out.println("linked list middle "+(System.currentTimeMillis()-curTime));
    }

}
