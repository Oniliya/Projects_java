// Задача: Напишите программу, которая запрашивает у пользователя его возраст.
// Если возраст меньше 0 или больше 120, программа должна выбрасить исключение InvalidAgeException
// с сообщением "Некорректный возраст". Если пользователь вводит не число, программа должна выбросить
// исключение NumberFormatEcxeption с сообщением "Некорректный формат числа".
// В остальных случаях программа должна вывести сообщение "Ваш возраст [возраст]".

import java.text.Format;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите возраст");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        try {
            int age = Integer.parseInt(inputString);
            if ((age<0)|(age>120)) {
                InvalidAgeException error = new InvalidAgeException("Некорректный возраст");
                throw error;
            }
            System.out.printf("Ваш возраст [%d]", age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("Некорректный формат числа "+e.getMessage());
        }



    }    
    


    public static class InvalidAgeException extends RuntimeException{
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}