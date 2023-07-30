import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("Программа калькулятор ");
        System.out.println("Необходимо ввести два числа  ");
        System.out.println("И указать операцию над числами (+, -, *, /, ^)");
        
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        String inputNum1 = scanner.nextLine();
        
        while (true) {
            System.out.println("Введите операцию (+, -, *, /, ^) ");
            String oper = scanner.nextLine();
            
            if (oper.equals("*")) {
                System.out.println("Введите число ");
                String inputNum2 = scanner.nextLine();
                int a = Integer.parseInt(inputNum1);
                int b = Integer.parseInt(inputNum2);
                inputNum1 = String.valueOf(PowerCalculator.mult(a,b));
                System.out.println("результат = " + inputNum1);
                continue;
            }
            if (oper.equals("-")) {
                System.out.println("Введите число ");
                String inputNum2 = scanner.nextLine();
                int a = Integer.parseInt(inputNum1);
                int b = Integer.parseInt(inputNum2);
                inputNum1 = String.valueOf(PowerCalculator.minus(a,b));
                System.out.println("результат = " + inputNum1);
                continue;
            }  
            if (oper.equals("+")) {
                System.out.println("Введите число ");
                String inputNum2 = scanner.nextLine();
                int a = Integer.parseInt(inputNum1);
                int b = Integer.parseInt(inputNum2);
                inputNum1 = String.valueOf(PowerCalculator.plus(a,b));
                System.out.println("результат = " + inputNum1);
                continue;
            }     
            if (oper.equals("/")) {
                System.out.println("Введите число ");
                String inputNum2 = scanner.nextLine();
                int a = Integer.parseInt(inputNum1);
                int b = Integer.parseInt(inputNum2);
                if (b==0) {
                    System.out.println("делить на ноль нельзя ");
                    continue;
                }
                else{
                    inputNum1 = String.valueOf(PowerCalculator.divide(a,b));
                    System.out.println("результат = " + inputNum1);
                    continue;
                }
            }
            if (oper.equals("^")) {
                System.out.println("Введите число ");
                String inputNum2 = scanner.nextLine();
                int a = Integer.parseInt(inputNum1);
                int b = Integer.parseInt(inputNum2);
                if (b<=0) {
                    InvalidInputException error = new InvalidInputException("некорректная степень (ноль) или отрицательная степень ");
                    throw error;
                    // continue;
                }
                else{
                    inputNum1 = String.valueOf(PowerCalculator.calculatePower(a,b));
                    System.out.println("результат = " + inputNum1);
                    continue;
                }  
                }           
            }                 
        }
        

    
    public class PowerCalculator {
        public static int plus(int a, int b) {
            return a+b;
        }
        public static int minus(int a, int b) {
            return a-b;
        }
        public static int mult(int a, int b) {
            return a*b;
        }
        public static int divide(int a, int b) {
            return a/b;
        }
        public static int calculatePower(int a, int b) {
            int result = a;
            for (int i = 2; i <= b; i++) {
               result *=a; 
            }
            return result;
        }


    }

    public static class InvalidInputException extends RuntimeException{
        public InvalidInputException(String message) {
            super(message);
        }
    }  
}
