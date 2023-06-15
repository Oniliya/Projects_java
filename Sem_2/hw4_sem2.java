// 4*. К калькулятору из предыдущего дз добавить логирование

package Sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hw4_sem2 {
   public static void main(String[] args) throws Exception {
        
        while (true) {
            System.out.printf("Чтобы остановиься введите 'stop' ");
            String s=input_num();
            try {
                int n1 = Integer.valueOf(s);
                String sign = input_sign();
                int n2= Integer.valueOf(input_num());
                StringBuilder sb = new StringBuilder();
                System.out.println(calc(n1, n2, sign));
                
                sb.append(Integer.toString(n1));
                sb.append(sign);
                sb.append(Integer.toString(n2));
                sb.append("=");
                sb.append(Double.toString(calc(n1, n2, sign)));

                writeToFile(sb.toString());
                sb = sb.delete(0, sb.toString().length());

            }
            catch(Exception e){
                break;
            }
        }

    }

    private static double calc(int a, int b, String zn) {
        double d_n1 =a;
        double d_n2 =b;

        if (zn.equals("+")) return(d_n1+d_n2);
        else if (zn.equals("-")) return(d_n1-d_n2);
        else if (zn.equals("*")) return(d_n1*d_n2);
        else if (zn.equals("/")) return(d_n1/d_n2);   
        
        return (Double) null;
        
    }

    private static String input_sign() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите знак арифметической операции (+ - * /) ");
        String ch = iScanner.nextLine();
         
        return ch;
    }

    private static String input_num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число  ");

        // String number = iScanner.nextLine();
        String res = iScanner.nextLine();
        // Integer res = Integer.valueOf(number);
        return res;

        
    }     

    private static void writeToFile(String str) throws IOException {
        File file = new File("Sem_2/hw4_out.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(str);
                fileWriter.write("\n");
            }
        catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}
