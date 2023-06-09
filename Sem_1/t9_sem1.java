// Записать в файл следующие данные:
// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 


package Sem_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class t9_sem1 {
       public static void main(String[] args) {
          
       String[] text = {"Name Surname Age", "Kate Smith 20", "Paul Green 25", "Mike Black 23"}; 

       File file = new File("Sem_1/data.txt");

       try (FileWriter fileWriter = new FileWriter(file)) {
        for (String str : text) {
                fileWriter.write(str);
                fileWriter.write("\n");

            }
       } catch (IOException ex) {
        System.out.println("ERROR");
       }
    }
} 
