// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException 
// с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

// Обратите внимание, что в обоих задачах используются собственные исключения, 
// которые наследуются от класса Exception. Это позволяет нам определить специфическую 
// причину ошибки и передать информацию об ошибке для последующей обработки.

import java.util.Scanner;

public class HW_task2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        String inputString1 = scanner.nextLine();
        System.out.println("Введите второе число ");
        String inputString2 = scanner.nextLine();


        try {
            int number1 = Integer.parseInt(inputString1);
            int number2 = Integer.parseInt(inputString2);
            if ((number2==0)) {
                DivisionByZeroException error = new DivisionByZeroException("Деление на ноль недопустимо");
                throw error;
            }
            System.out.printf("Результат деления = %.2f", (double)number1/(double)number2);
        } 
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }



    }    
    


    public static class DivisionByZeroException extends RuntimeException{
        public DivisionByZeroException(String message) {
            super(message);
        }
    } 
    
}
