// 3.** Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"
// Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент
// [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package Sem_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hw3_sem3 {
    public static void main(String[] args) throws IOException {

        String path = "Sem_2/hw3_input.txt";
        String str = readFromFile(path);
        System.out.println(str);
        str=str.replace("{", "");
        str=str.replace("}", "");
        str=str.replace("[", "");
        str=str.replace("]", "");
        System.out.println(str);

        String[] parts = str.split(",");
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < parts.length; index++) {
            String[] subParts = parts[index].trim().split(":");
            if (index%3==0){
                sb.append("Студент ");
                sb.append(subParts[1]);
            }
            if (index%3==1){
                sb.append(" получил ");
                sb.append(subParts[1]);
            }
            if (index%3==2){
                sb.append(" по предмету ");
                sb.append(subParts[1]);
                System.out.println(sb.toString());

                writeToFile(sb.toString());
                sb = sb.delete(0, sb.toString().length());
            }            
        }
    }
    private static String readFromFile(String path){            
        try (FileReader reader = new FileReader(path)){
            int c;
            StringBuilder sb = new StringBuilder();
            while((c=reader.read())!=-1){
                sb.append((char)c);
            }
            // System.out.println(sb.toString());
            return sb.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

    private static void writeToFile(String str) throws IOException {
        File file = new File("Sem_2/hw3_out.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(str);
                fileWriter.write("\n");
            }
        catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}
