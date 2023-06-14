// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.


package Sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class T4_sem2 {
    public static void execute() throws IOException {
        String str1 = "TEST";

        String str = create_str(str1, 100);

        create_file(str);
        
    }


    private static void create_file(String str) throws IOException {
        File file = new File("Sem_2/test.txt");
        try (FileWriter fileWriter = new FileWriter(file)){ 
            fileWriter.write(str);
            
            // fileWriter.write("\n");
            System.out.println("file created");
        }
        catch (IOException ex) {
            System.out.println("file already exist");
            System.out.println(ex);
        }
    }
    
    private static String create_str(String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
