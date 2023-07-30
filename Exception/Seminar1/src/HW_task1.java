// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException 
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class HW_task1 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            if ((number<=0)) {
                InvalidNumberException error = new InvalidNumberException("Некорректное число");
                throw error;
            }
            System.out.println("Число корректно");
        } 
        catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }



    }    
    


    public static class InvalidNumberException extends RuntimeException{
        public InvalidNumberException(String message) {
            super(message);
        }
    }    
}
