// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

package Sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class T5_sem2 {
    public static void execute() throws IOException {
        String path = System.getProperty("user.dir").concat("\\Sem_2\\");
        System.out.println(path);
        // String[] mass = create_mas(path);
        fileName(path);
        writeToFile(fileName(path));
        

    }

    public static List<String> fileName(String dirPath){
        List<String> fNames = new ArrayList<>();
        File directory = new File(dirPath);

        if (directory.isDirectory()){
            for (File item: directory.listFiles()){
                fNames.add(item.getName());
                try {
                    System.out.println(item.getName());
                    System.out.println(item.getName().substring(item.getName().lastIndexOf(".")));

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }

        return fNames;
    }

    public static void writeToFile(List<String> listOfStr) throws IOException{
        File file = new File("Sem_2/list_files.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (String str : listOfStr) {
                fileWriter.write(str);
                fileWriter.write("\n");
                fileWriter.write("Расширение файла: ");
                fileWriter.write(str.substring(str.lastIndexOf(".")));
                fileWriter.write("\n");
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
       }
    }

    private static String[] create_mas(String path){

        System.out.println(path);

        return null;
    }
}
