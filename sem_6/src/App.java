import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Comps nb1 = new Comps("Asus", "1234567890", "Windows", 16, 512, 0);
        Comps nb2 = new Comps("Aser", "1234555890", "Linux", 16, 1024, 1);
        Comps nb3 = new Comps("HP", "1237777890", "Windows", 32, 512, 2);
        Comps nb4 = new Comps("Asus", "9999998888", "Linux", 16, 2048, 3);
        Comps nb5 = new Comps("HP", "1237777890", "Windows", 32, 512, 4);
//        System.out.println(nb1);

        LinkedList<Comps> nbList = new LinkedList<Comps>();
        nbList.add(0, nb1);
        nbList.add(1, nb2);
        nbList.add(2, nb3);
        nbList.add(3, nb4);
        nbList.add(4, nb5);

        
        System.out.println("сравнить между собой все данные");
        compare(nbList);
        printStore(nbList);
        search(nbList);

    }
// поиск по заданным параметрам (по имени, названию операционной системы или серийному номеру)
    public static Comps search(LinkedList<Comps> inList){
        String searchString = inputData("Введите данные для поиска (name, os, serialNumbe) ");
        for (int i = 0; i < inList.size(); i++) {
            Comps nb = inList.get(i);
            if (nb.name.equals(searchString) || nb.serialNumber.equals(searchString) || nb.os.equals(searchString)){
                System.out.println(nb);

            } 
        }
        return null;
    }

// ввод строки для поиска
    public static String inputData(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

// сравнение между собой всех элементов, которые и есть ноутбуки в магазине
    public static void compare(LinkedList<Comps> listToCompare){
        for (int i = 0; i < listToCompare.size()-1   ; i++) {
            Comps nbTemp1 = listToCompare.get(i);
            for (int j = i+1; j < listToCompare.size(); j++) {
                Comps nbTemp2 = listToCompare.get(j);
                    if (nbTemp1.equals(nbTemp2)){
                        System.out.println("notebook id "+ nbTemp1.id +" тот же, что и notebook id "+ nbTemp2.id);
                    }
            }
        }
            
    }
// вывод всех элементов в магазине
    public static void printStore(LinkedList<Comps> listToPrint){
        for (Comps comps : listToPrint) {
            System.out.println(comps);
        }
    }
}
