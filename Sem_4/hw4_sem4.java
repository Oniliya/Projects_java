// 4(со звездочкой) Реализовать стэк с помощью массива. Нужно реализовать методы: 
// size(), 
// empty(), 
// push(), 
// peek(), 
// peek().




package Sem_4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class hw4_sem4 {
    public static void main(String[] args) throws IOException {
        int count = input_num("Введите количество элементов стека ");
        int[] myMas= createMas(count);
        for (int i : myMas ){
            System.out.print(i + " ");
        }
        with_mas(myMas);

    }

    private static void with_mas(int[] withMas) {
        int[] chMas = withMas;
        boolean getIteration = true;
        while (getIteration) {
            String command = inputCommand("\nвведите команду \nразмер стека - size \nочистить стек empty \nдобавить элементв стек - push \nпоказать верхний элемент из стека peek \nпоказать и удалить верхний элемент из стека pop");
            command = command.toUpperCase();
            String st= new String();
            switch (command) {
                case "SIZE":
                    System.out.println(chMas.length);
                    break;
                case "EMPTY":
                    chMas= null;
                    System.out.println("стек очищен");
                    break;
                case "PUSH":
                    int new_el = input_num("Введите новый элемент стека ");
                    chMas = plusOne(chMas, new_el);
                    for (int i : chMas ){
                         System.out.print(i + " ");
                    }
                    break;
                case "PEEK":
                    System.out.println(chMas[chMas.length-1]);
                    break;
                case "POP":
                    chMas=delOne(chMas);
                    for (int i : chMas ){
                         System.out.print(i + " ");
                    }
                    break;

                default:
                    getIteration = false;
                    break;
            }

        }
    }

    private static int[] plusOne(int[] toMass, int newElement) {
        int[] tmpMass = new int[toMass.length+1];
        for (int i = 0; i < toMass.length; i++) {
            tmpMass[i] = toMass[i];
        }
        tmpMass[toMass.length]=newElement;
        return tmpMass;
    }

    private static int[] delOne(int[] fromMass) {
        int[] tmpMass = new int[fromMass.length-1];
        for (int i = 0; i < fromMass.length-1; i++) {
            tmpMass[i] = fromMass[i];
        }
        System.out.println(fromMass[fromMass.length-1]);
        return tmpMass;
    }

    private static String inputCommand(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    private static int input_num(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(msg);
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }

    private static int[] createMas(int count){
        int[] mas = new int[count];
        Random random = new Random();
        for (int i=0; i<count; i++) {
            mas[i]=random.nextInt(100);
        }
        return mas;
    }
    
}
