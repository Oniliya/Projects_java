import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import OriginNumFinder.T1_sem6;

import CatLibrary.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // HashSet<Integer> numSet = new HashSet<Integer>();
        // numSet.
        int[] myInt = T1_sem6.getRandomArray(127,25);
        // System.out.println(myInt);
        for (int i : myInt) {
            System.out.print(Integer.toString(i)+" ");
        }
        
        System.out.println();
        System.out.println("-----------------");

        Set<Integer> mySet = T1_sem6.arrayToSet(myInt);
        for (Integer integer : mySet) {
            System.out.print(integer+" ");
            
        }

        System.out.println();

        double result = T1_sem6.proc(myInt.length, mySet.size());
        System.out.println("процент уникальности чисел: "+result);



        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        Cat myCat = new Cat(2000, "Барсик", 245, formatter.parse("Sat, April 4, 2019"), true, 1);
        Cat motherCat = new Cat(3000, "Кеша", 245, formatter.parse("Sat, April 4, 2010"), false, 2);

        HashSet<Cat> catSet = new HashSet<Cat>();
        catSet.add(myCat);
        catSet.add(motherCat);

        System.out.println(myCat);
        System.out.println(motherCat);

        System.out.println(myCat.equals(motherCat));
        System.out.println(catSet.contains(motherCat));


        System.out.println(myCat.id);
        // System.out.println(catSet.contains(245));
        // for (Cat cat : catSet) {
        //     if ((cat.weight==245)||(cat.color==245)){
        //         System.out.println("да");
        //     }
        // }


    }
}
