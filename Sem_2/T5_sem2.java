// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

package Sem_2;

import java.io.IOException;

public class T5_sem2 {
    public static void execute() throws IOException {
        String path = System.getProperty("user.dir").concat("\\Sem_2\\");

        String[] mass = create_mas(path);

        

    }

    private static String[] create_mas(String path){

        System.out.println(path);

        return null;
    }
}
