// 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
// запишите в лог-файл.

package Sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw2_sem2 {
    public static void main(String[] args) throws IOException {
        int[] mas = createMas(input_num());
        System.out.println(Arrays.toString(mas));
        sortLog(mas);
        
    }
    
    private static int[] createMas(int count){
        int[] mas = new int[count];
        Random random = new Random();
        for (int i=0; i<count; i++) {
            mas[i]=random.nextInt(100);
        }
        return mas;
    }

    private static void sortLog(int[] mass) throws IOException {
        StringBuilder sb = new StringBuilder();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mass.length-1; i++) {
                if(mass[i] > mass[i+1]){
                    isSorted = false;

                    sb.append(Integer.toString(mass[i]));
                    sb.append(" <-> ");
                    sb.append(Integer.toString(mass[i+1]));
                    sb.append("\n");
                    writeToFile(sb.toString());

                    buf = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = buf;

                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    private static void writeToFile(String str) throws IOException {
        File file = new File("Sem_2/hw2_logs.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(str);
                fileWriter.write("\n");
            }
        catch (IOException ex) {
            System.out.println("ERROR");
        }
    }

    private static int input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов в массиве ");
        String number = iScanner.nextLine();
        Integer res = Integer.valueOf(number);
        return res;
    }
}
