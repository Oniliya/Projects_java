// Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class HW_task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        String inputString1 = scanner.nextLine();
        System.out.println("Введите второе число ");
        String inputString2 = scanner.nextLine();
        System.out.println("Введите третье число ");
        String inputString3 = scanner.nextLine();


        try {
            int number1 = Integer.parseInt(inputString1);
            int number2 = Integer.parseInt(inputString2);
            int number3 = Integer.parseInt(inputString3);
            if ((number1>100)) {
                NumberOutOfRangeException error = new NumberOutOfRangeException("Первое число вне допустимого диапазна");
                throw error;
            }
            if ((number2<0)) {
                NumberOutOfRangeException error = new NumberOutOfRangeException("Второе число вне допустимого диапазна");
                throw error;
            }
            if (number1+number2 <10) {
                NumberSumException error = new NumberSumException("Сумма первого и второго чисел слишком мала");
                throw error;
            }    
            if ((number3==0)) {
                DivisionByZeroException error = new DivisionByZeroException("Деление на ноль недопустимо");
                throw error;
            }
            System.out.println("Проверка пройдена успешно");
        } 
        catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberSumException e) {
            System.out.println(e.getMessage());
        }



    }    
    public static class NumberSumException extends RuntimeException{
        public NumberSumException(String message) {
            super(message);
        }
    } 

    public static class DivisionByZeroException extends RuntimeException{
        public DivisionByZeroException(String message) {
            super(message);
        }
    }     

    public static class NumberOutOfRangeException extends RuntimeException{
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    } 
     
}
